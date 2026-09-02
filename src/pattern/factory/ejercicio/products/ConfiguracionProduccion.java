package pattern.factory.ejercicio.products;

public class ConfiguracionProduccion extends Configuracion {

    public ConfiguracionProduccion() {
        nombreEmpresa = "Mi Empresa";
        urlServidor = "https://empresa.com";
        logs = false;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Configuración de Producción");
    }
}