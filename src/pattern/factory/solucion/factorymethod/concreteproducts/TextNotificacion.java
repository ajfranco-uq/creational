package pattern.factory.solucion.factorymethod.concreteproducts;

import pattern.factory.solucion.factorymethod.product.Notificacion;

public class TextNotificacion implements Notificacion {
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
