package pattern.factory.solucion.factory1;

class TextNotificacion implements Notificacion {
    private String numeroTelefono;

    // Constructor que recibe el número de teléfono
    public TextNotificacion(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando notificación por mensaje de texto al número: " + numeroTelefono);
        // Lógica para notificación por mensaje de texto
    }
}
