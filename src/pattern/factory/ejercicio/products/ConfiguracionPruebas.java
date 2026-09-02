package pattern.factory.ejercicio.products;

public class ConfiguracionPruebas extends Configuracion {

    public ConfiguracionPruebas() {
        nombreEmpresa = "Mi Empresa";
        urlServidor = "https://test.empresa.com";
        logs = true;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Configuración de Pruebas");
    }
}