package pattern.abstractfactory.solucion;// ============================================================

import pattern.abstractfactory.solucion.factory.FabricaBaloncesto;
import pattern.abstractfactory.solucion.factory.FabricaDeportiva;
import pattern.abstractfactory.solucion.factory.FabricaFutbol;

public class Main {

    public static void main(String[] args) {

        // --------------------------------------------------------
        // FAMILIA FÚTBOL
        // --------------------------------------------------------

        FabricaDeportiva fabricaFutbol = new FabricaFutbol();
        TiendaDeportiva tiendaFutbol = new TiendaDeportiva(fabricaFutbol);
        tiendaFutbol.mostrarProductos();


        // --------------------------------------------------------
        // FAMILIA BALONCESTO
        // --------------------------------------------------------

        FabricaDeportiva fabricaBaloncesto = new FabricaBaloncesto();
        TiendaDeportiva tiendaBaloncesto = new TiendaDeportiva(fabricaBaloncesto);
        tiendaBaloncesto.mostrarProductos();
    }
}