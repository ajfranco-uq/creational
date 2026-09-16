package pattern.factory.solucion.simplefactory;

class EmailNotificacion implements Notificacion {
    private String correo;

    // Constructor que recibe la dirección del mail
    public EmailNotificacion(String correo) {
        this.correo = correo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por correo electrónico a: " + correo);
        // Lógica específica para enviar notificación por correo
    }
}
