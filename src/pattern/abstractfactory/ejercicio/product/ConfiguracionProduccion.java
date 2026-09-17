package pattern.abstractfactory.ejercicio.product;

public class ConfiguracionProduccion extends Configuracion {

    public ConfiguracionProduccion() {
        nombreAmbiente = "Producción";
        logs = false;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Configuración de Producción");
        System.out.println("Logs: " + logs);
    }
}