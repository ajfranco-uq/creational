package pattern.prototype.solucion.ejercicio;

public class Main {

    public static void main(String[] args) {

        // Configuración original
        Configuracion produccion = new Configuracion(
                "Mi Empresa",
                "COP",
                19,
                "/reportes",
                "https://servidor-produccion.com",
                443,
                false,
                true
        );

        // Crear una nueva configuración a partir de la original
        Configuracion nueva = produccion.clone();

        // Modificar solamente lo necesario
        nueva.setUrlServidor("https://servidor-produccion-2.com");
        nueva.setPuerto(8443);

        System.out.println("Original:");
        System.out.println(produccion.getUrlServidor());
        System.out.println(produccion.getPuerto());

        System.out.println("\nCopia:");
        System.out.println(nueva.getUrlServidor());
        System.out.println(nueva.getPuerto());

        // Comprobar que son objetos diferentes
        System.out.println("\n¿Es el mismo objeto?");
        System.out.println(produccion == nueva);
    }
}