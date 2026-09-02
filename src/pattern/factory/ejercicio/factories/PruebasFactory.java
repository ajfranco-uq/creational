package pattern.factory.ejercicio.factories;

import pattern.factory.ejercicio.products.Configuracion;
import pattern.factory.ejercicio.products.ConfiguracionPruebas;

public class PruebasFactory extends ConfiguracionFactory {

    @Override
    public Configuracion crearConfiguracion() {
        return new ConfiguracionPruebas();
    }

}