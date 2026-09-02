package pattern.factory.problema;

public class Main {

    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion();

        notificacion.enviarNotificacion("EMAIL","Hola");
    }
}
