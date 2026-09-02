package pattern.singleton.eager;

public class EagerSingleton {
    // El objeto se crea AQUÍ, justo al iniciar el programa
    private static final EagerSingleton instancia = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("¡Objeto creado al iniciar el programa!");
    }

    // Ya no hace falta ningún "if", solo devolvemos el objeto que ya existe
    public static EagerSingleton getInstancia() {
        return instancia;
    }

    public void saludar() {
        System.out.println("Hola desde el Singleton Eager");
    }
}