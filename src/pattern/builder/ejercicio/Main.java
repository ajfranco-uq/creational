package pattern.builder.ejercicio;

public class Main {

    public static void main(String[] args) {

        Configuracion configuracion = new Configuracion.Builder()
                .nombreEmpresa("Mi Empresa")
                .moneda("COP")
                .impuesto(44)
                .rutaReportes("/reportes")
                .urlServidor("https://servidor.com")
                .puerto(443)
                .logs(true)
                .notificaciones(true)
                .build();

        System.out.println("Empresa: " + configuracion.getNombreEmpresa());
        System.out.println("Moneda: " + configuracion.getMoneda());
        System.out.println("Impuesto: " + configuracion.getImpuesto());
        System.out.println("Servidor: " + configuracion.getUrlServidor());
        System.out.println("Puerto: " + configuracion.getPuerto());
        System.out.println("Logs: " + configuracion.isLogs());
        System.out.println("Notificaciones: " + configuracion.isNotificaciones());

        System.out.println("--------------------------------------------");





        //Aquí moneda, impuesto, rutaReportes, puerto, etc. toman sus valores por defecto definidos en el Builder.
        Configuracion desarrollo = new Configuracion.Builder()
                .nombreEmpresa("Mi Empresa")
                .logs(true)
                .build();


        System.out.println("Empresa: " + desarrollo.getNombreEmpresa());
        System.out.println("Moneda: " + desarrollo.getMoneda());
        System.out.println("Impuesto: " + desarrollo.getImpuesto());
        System.out.println("Servidor: " + desarrollo.getUrlServidor());
        System.out.println("Puerto: " + desarrollo.getPuerto());
        System.out.println("Logs: " + desarrollo.isLogs());
        System.out.println("Notificaciones: " + desarrollo.isNotificaciones());

    }
}