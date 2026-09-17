package pattern.abstractfactory.ejercicio.server;

public class ServidorProduccion implements Servidor {

    @Override
    public void conectar() {
        System.out.println("Conectando al servidor oficial...");
    }
}