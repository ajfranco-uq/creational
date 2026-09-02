package pattern.singleton.sinchronized;

public class SingletonSynchronized {

    private static SingletonSynchronized instancia;

    private SingletonSynchronized() {
        System.out.println("¡Objeto creado de forma segura!");
    }

    // Al agregar "synchronized", solo UN hilo puede ejecutar este método a la vez
    public static synchronized SingletonSynchronized getInstancia() {
        if (instancia == null) {
            instancia = new SingletonSynchronized();
        }
        return instancia;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println("Trabajando de forma segura entre hilos. " + mensaje);
    }

}
