package pattern.factory.ejercicio.products;

public class ConfiguracionDesarrollo extends Configuracion {

    public ConfiguracionDesarrollo() {
        nombreEmpresa = "Mi Empresa";
        urlServidor = "http://localhost:8080";
        logs = true;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Configuración de Desarrollo");
    }
}