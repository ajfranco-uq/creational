package pattern.abstractfactory.ejercicio.product;

public class ConfiguracionDesarrollo extends Configuracion {

    public ConfiguracionDesarrollo() {
        nombreAmbiente = "Desarrollo";
        logs = true;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Configuración de Desarrollo");
        System.out.println("Logs: " + logs);
    }
}