package pattern.singleton.sinchronized;

public class SinchronizedMain {
    public static void main(String[] args) {
        System.out.println("--- Inicio del programa seguro ---");

        // Hilo 1 intenta obtener la instancia
        Thread hilo1 = new Thread(() -> {
            SingletonSynchronized s1 = SingletonSynchronized.getInstancia();
            s1.mostrarMensaje("Hilo 1");
        });

        // Hilo 2 intenta obtener la instancia al mismo tiempo
        Thread hilo2 = new Thread(() -> {
            SingletonSynchronized s2 = SingletonSynchronized.getInstancia();
            s2.mostrarMensaje("Hilo 2");
        });

        // Arrancamos ambos hilos a la vez
        hilo1.start();
        hilo2.start();
    }
}

//El único "pero" de este enfoque (Desventaja)

// Poner synchronized directamente en todo el método funciona perfecto, pero tiene un pequeño problema de rendimiento:
//
//  El candado se usa cada vez que alguien llama a getInstancia().
//  Una vez que el objeto ya fue creado (después de la primera vez), el candado ya no es necesario porque el if siempre dará falso.
//  Sin embargo, los hilos seguirán haciendo fila inútilmente, lo que puede volver tu app un poco lenta si se usa miles de veces.
