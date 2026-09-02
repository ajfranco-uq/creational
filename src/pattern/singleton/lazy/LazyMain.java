package pattern.singleton.lazy;

public class LazyMain {

    public static void main(String[] args) {

        Objecto o1 = new Objecto();
        Objecto o2 = new Objecto();

        if (o1 == o2){
            System.out.println("MISMA ISNTANCIA de Objeto!!!");
        }else{
            System.out.println("DIFERENTE INSTANCIA de Objeto");
        }


        LazyInitSingleton l = LazyInitSingleton.getInstance();
        l.hello();

        LazyInitSingleton l2 = LazyInitSingleton.getInstance();
        l2.hello();

        if(l == l2){
            System.out.println("MISMA ISNTANCIA Singleton!!!");
        }else{
            System.out.println("DIFERENTE INSTANCIA Singleton");
        }
    }
}

// 1. No es seguro con "hilos" (No es Thread-Safe)
// 2. Dificulta las pruebas (Es difícil de testear)
// 3. Oculta las dependencias
