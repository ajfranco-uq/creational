package pattern.factory.ejercicio;

import pattern.factory.ejercicio.factories.ConfiguracionFactory;
import pattern.factory.ejercicio.factories.DesarrolloFactory;
import pattern.factory.ejercicio.factories.ProduccionFactory;
import pattern.factory.ejercicio.products.Configuracion;

public class Main {

    public static void main(String[] args) {

        ConfiguracionFactory prodFactory = new ProduccionFactory();
        Configuracion prodConfiguracion = prodFactory.crearConfiguracion();
        prodConfiguracion.mostrarDatos();

        ConfiguracionFactory devFactory = new DesarrolloFactory();
        Configuracion devConfiguracion = devFactory.crearConfiguracion();
        devConfiguracion.mostrarDatos();
    }

}