package pattern.factory.ejercicio.products;

public abstract class Configuracion {

    protected String nombreEmpresa;
    protected String urlServidor;
    protected boolean logs;

    public abstract void mostrarDatos();
}