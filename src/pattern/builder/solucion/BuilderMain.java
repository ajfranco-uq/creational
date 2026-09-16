package pattern.builder.solucion;

import pattern.builder.Producto;

import java.util.List;

public class BuilderMain {

    public static void main(String[] args) {

        List<Producto> productos = List.of(
                new Producto("Laptop", 3000000),
                new Producto("Mouse", 80000)
        );

        Pedido pedido = new Pedido.Builder()
                .numero("PED-001")
                .cliente("Andres")
                .productos(productos)
                .direccionEntrega("Armenia")
                .metodoPago("TARJETA")
                .descuento(10)
                .envioExpress(true)
                .observaciones("Entregar después de las 5 PM")
                .notificarCliente(true)
                .build();

        System.out.println(pedido);



        //Y podemos omitir los opcionales

        Pedido pedido2 = new Pedido.Builder()
                .numero("PED-002")
                .cliente("Maria")
                .productos(productos)
                .build();
    }
}
