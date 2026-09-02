package pattern.factory.ejercicio.factories;

import pattern.factory.ejercicio.products.Configuracion;
import pattern.factory.ejercicio.products.ConfiguracionProduccion;

public class ProduccionFactory extends ConfiguracionFactory {

    @Override
    public Configuracion crearConfiguracion() {
        return new ConfiguracionProduccion();
    }

}