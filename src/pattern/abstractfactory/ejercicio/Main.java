package pattern.abstractfactory.ejercicio;

import pattern.abstractfactory.ejercicio.factory.FabricaAmbiente;
import pattern.abstractfactory.ejercicio.factory.FabricaDesarrollo;
import pattern.abstractfactory.ejercicio.factory.FabricaProduccion;

public class Main {

    public static void main(String[] args) {

        // ========================================================
        // AMBIENTE DE DESARROLLO
        // ========================================================

        FabricaAmbiente fabrica = new FabricaDesarrollo();

        Aplicacion aplicacion = new Aplicacion(fabrica);

        aplicacion.iniciar();


        // ========================================================
        // Si quisiéramos Producción, simplemente cambiamos
        // la fábrica.
        // ========================================================

        fabrica = new FabricaProduccion();

        aplicacion = new Aplicacion(fabrica);

        aplicacion.iniciar();
    }
}