package pattern.factory.solucion.factorymethod.concretefactory;

import pattern.factory.solucion.factorymethod.concreteproducts.EmailNotificacion;
import pattern.factory.solucion.factorymethod.factory.NotificacionFactory;
import pattern.factory.solucion.factorymethod.product.Notificacion;

public class EmailNotificacionFactory implements NotificacionFactory {
   private String correo;

   // Constructor que recibe la dirección de correo electrónico
   public EmailNotificacionFactory(String correo) {
       this.correo = correo;
   }

   @Override
   public Notificacion crearNotificacion() {
    // Se pasa la dirección del mail a la notificación creada
       return new EmailNotificacion(correo);
   }
}
