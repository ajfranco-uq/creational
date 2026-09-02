package pattern.factory.ejercicio.factories;

import pattern.factory.ejercicio.products.Configuracion;
import pattern.factory.ejercicio.products.ConfiguracionDesarrollo;

public class DesarrolloFactory extends ConfiguracionFactory {

    @Override
    public Configuracion crearConfiguracion() {
        return new ConfiguracionDesarrollo();
    }

}