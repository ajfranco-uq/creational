package pattern.abstractfactory.ejercicio.server;

public class ServidorPruebas implements Servidor {

    @Override
    public void conectar() {
        System.out.println("Conectando al servidor de pruebas...");
    }
}