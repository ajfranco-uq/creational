package pattern.factory.solucion.simplefactory;

public class Main {

    public static void main(String[] args) {

        Notificacion notificacion = NotificacionFactory.crear("EMAIL");

        notificacion.enviarNotificacion();
    }
}