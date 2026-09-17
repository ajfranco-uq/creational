package pattern.abstractfactory.ejercicio.server;

public class ServidorLocal implements Servidor {

    @Override
    public void conectar() {
        System.out.println("Conectando al servidor local...");
    }
}