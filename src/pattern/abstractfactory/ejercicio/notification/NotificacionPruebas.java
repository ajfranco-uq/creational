package pattern.abstractfactory.ejercicio.notification;

public class NotificacionPruebas implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("[PRUEBAS] " + mensaje);
    }
}