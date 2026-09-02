package pattern.abstractfactory.solucion;// ============================================================
// CLIENTE
// ============================================================

import pattern.abstractfactory.solucion.factory.FabricaDeportiva;
import pattern.abstractfactory.solucion.products.Camiseta;
import pattern.abstractfactory.solucion.products.Zapatos;

/**
 * Clase cliente encargada de crear los productos
 * */
public class TiendaDeportiva {

    private Zapatos zapatos;
    private Camiseta camiseta;

    public TiendaDeportiva(FabricaDeportiva fabrica) {

        // El cliente NO sabe si está creando productos de fútbol o de baloncesto.
        zapatos = fabrica.crearZapatos();
        camiseta = fabrica.crearCamiseta();
    }

    public void mostrarProductos() {
        zapatos.mostrar();
        camiseta.mostrar();
    }
}