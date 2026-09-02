package pattern.abstractfactory.solucion.factory;// ============================================================

import pattern.abstractfactory.solucion.products.Camiseta;
import pattern.abstractfactory.solucion.products.CamisetaFutbol;
import pattern.abstractfactory.solucion.products.Zapatos;
import pattern.abstractfactory.solucion.products.ZapatosFutbol;

/**
 * FACTORY CONCRETA: FÚTBOL
 * // ============================================================
 * // Esta fábrica crea únicamente productos de la familia fútbol.
 */
public class FabricaFutbol implements FabricaDeportiva {

    @Override
    public Zapatos crearZapatos() {
        return new ZapatosFutbol();
    }

    @Override
    public Camiseta crearCamiseta() {
        return new CamisetaFutbol();
    }
}