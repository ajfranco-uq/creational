package pattern.factory.solucion.factory2;

class TextNotificacionFactory implements NotificacionFactory {
   private String numeroTelefono;

   // Constructor que recibe el número de teléfono
   public TextNotificacionFactory(String numeroTelefono) {
       this.numeroTelefono = numeroTelefono;
   }

   @Override
   public Notificacion crearNotificacion() {
       // Se pasa el número de teléfono a la notificación creada
       return new TextNotificacion(numeroTelefono);
   }
}
