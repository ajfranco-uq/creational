package pattern.singleton.ejercicio;

public class Pedidos {

    public void mostrarConfiguracion() {
        Configuracion config = Configuracion.getInstance();

        System.out.println(config.getMoneda());
        System.out.println(config.getImpuesto());
    }
}