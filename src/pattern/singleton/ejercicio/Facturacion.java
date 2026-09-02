package pattern.singleton.ejercicio;

public class Facturacion {

    public void cambiarImpuesto() {
        Configuracion config = Configuracion.getInstance();

        config.setImpuesto(19);
    }
}