package pattern.builder.problema;

import pattern.builder.Producto;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Producto> productos = List.of(
                new Producto("Laptop", 3000000),
                new Producto("Mouse", 80000)
        );

        Pedido pedido = new Pedido(
                "PED-001",
                "Andres",
                productos,
                "Armenia",
                "TARJETA",
                10,
                true,
                "Entregar después de las 5 PM",
                true
        );







        // Pero que pasaría en el caso de no querer los campos no requeridos?
        // Tenemos que utilizar null, 0 y false simplemente porque no queremos configurar algunas propiedades.

        Pedido pedido2 = new Pedido(
                "PED-001",
                "Andres",
                productos,
                null,
                "TARJETA",
                0,
                false,
                null,
                true
        );
    }
}
