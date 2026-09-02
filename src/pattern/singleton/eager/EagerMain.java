package pattern.singleton.eager;

public class EagerMain {

    public static void main(String[] args) {
        System.out.println("El programa ya arrancó...");

        System.out.println("\nPedimos el objeto 1:");
        EagerSingleton objeto1 = EagerSingleton.getInstancia();
        objeto1.saludar();

        System.out.println("\nPedimos el objeto 2:");
        EagerSingleton objeto2 = EagerSingleton.getInstancia();
        objeto2.saludar();
    }
}

// 1. Desperdicio de memoria y recursos (Gasto inútil)
// 2. Ralentiza el arranque de la aplicación
// 3. No permite configuraciones dinámicas previos a su creación
// 4. Dificultad para manejar errores en la inicialización
