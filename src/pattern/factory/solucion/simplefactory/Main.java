package pattern.factory.solucion.factory1;

public class Main {

    public static void main(String[] args) {

        Notificacion notificacion = NotificacionFactory.crear("EMAIL");

        notificacion.enviarNotificacion();
    }
}