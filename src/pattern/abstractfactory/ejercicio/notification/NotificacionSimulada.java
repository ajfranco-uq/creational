package pattern.abstractfactory.ejercicio.notification;

public class NotificacionSimulada implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[SIMULADA] " + mensaje);
    }
}