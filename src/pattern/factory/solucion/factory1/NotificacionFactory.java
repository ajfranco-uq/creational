package pattern.factory.solucion.factory1;

public class NotificacionFactory {

    public static Notificacion crear(String tipo) {

        if (tipo.equals("EMAIL")) {
            return new EmailNotificacion("Hola");

        } else if (tipo.equals("SMS")) {
            return new TextNotificacion("3111234567");

        }

        throw new IllegalArgumentException("Tipo no válido");
    }
}