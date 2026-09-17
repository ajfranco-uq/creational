package pattern.abstractfactory.ejercicio.product;

public class ConfiguracionPruebas extends Configuracion {

    public ConfiguracionPruebas() {
        nombreAmbiente = "Pruebas";
        logs = true;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Configuración de Pruebas");
        System.out.println("Logs: " + logs);
    }
}