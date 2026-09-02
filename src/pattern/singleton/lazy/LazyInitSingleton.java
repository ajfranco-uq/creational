package pattern.singleton.lazy;

public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
        System.out.println("Lazy initialization pattern.singleton creado!!!");
    }


    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hola Lazy!!!");
    }
}