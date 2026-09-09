package pattern.singleton.ejercicio;

public class Facturacion {

    public void cambiarImpuesto(int impuesto) {
        Configuracion config = Configuracion.getInstance();

        config.setImpuesto(impuesto);
    }
}