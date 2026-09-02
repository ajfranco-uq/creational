package pattern.abstractfactory.problema;

public class Main {

    public static void main(String[] args) {

        TiendaDeportiva tienda = new TiendaDeportiva();

        tienda.mostrarProductos("futbol");

        tienda.mostrarProductos("baloncesto");
    }
}