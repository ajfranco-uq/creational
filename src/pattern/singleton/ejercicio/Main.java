package pattern.singleton.ejercicio;

public class Main {

    public static void main(String[] args) {

        Configuracion config1 = Configuracion.getInstance();
        Configuracion config2 = Configuracion.getInstance();

        System.out.println(config1 == config2);

        config1.setImpuesto(25);

        System.out.println(config2.getImpuesto());

        Facturacion facturacion = new Facturacion();
        facturacion.cambiarImpuesto(20);

        Pedidos pedidos = new Pedidos();
        pedidos.mostrarConfiguracion();
    }
}

/*

Pedidos ─ ─ ─ ─ ─ ─ >  Configuracion
Facturacion ─ ─ ─ ─ >  Configuracion
Reportes ─ ─ ─ ─ ─ ─ > Configuracion


 */
