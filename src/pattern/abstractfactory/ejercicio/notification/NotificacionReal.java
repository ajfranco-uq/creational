package pattern.abstractfactory.ejercicio.notification;

public class NotificacionReal implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[REAL] Enviando: " + mensaje);
    }
}