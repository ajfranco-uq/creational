package pattern.factory.problema;

public class Notificacion {

    public void enviarNotificacion(String tipo, String mensaje) {

        if (tipo.equals("EMAIL")) {
            Email email = new Email();
            email.enviar(mensaje);

        } else if (tipo.equals("SMS")) {
            SMS sms = new SMS();
            sms.enviar(mensaje);

        } else if (tipo.equals("PUSH")) {
            Push push = new Push();
            push.enviar(mensaje);
        } else{
            System.out.println("SIN TIPO");
        }
        // Pero que pasa si se agregan más formas de enviar notificaciones?
    }
}
