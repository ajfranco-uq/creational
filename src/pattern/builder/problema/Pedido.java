package pattern.builder.problema;

import pattern.builder.Producto;

import java.util.List;

public class Pedido {

    private String numero;
    private String cliente;
    private List<Producto> productos;
    private String direccionEntrega;
    private String metodoPago;
    private double descuento;
    private boolean envioExpress;
    private String observaciones;
    private boolean notificarCliente;

    //Constructor con todos los campos
    public Pedido(
            String numero,
            String cliente,
            List<Producto> productos,
            String direccionEntrega,
            String metodoPago,
            double descuento,
            boolean envioExpress,
            String observaciones,
            boolean notificarCliente) {

        this.numero = numero;
        this.cliente = cliente;
        this.productos = productos;
        this.direccionEntrega = direccionEntrega;
        this.metodoPago = metodoPago;
        this.descuento = descuento;
        this.envioExpress = envioExpress;
        this.observaciones = observaciones;
        this.notificarCliente = notificarCliente;
    }

    //Constructor con solo algunos campos
    public Pedido(
            String numero,
            String cliente,
            List<Producto> productos) {

        this.numero = numero;
        this.cliente = cliente;
        this.productos = productos;
    }

    //Constructor con solo algunos campos
    public Pedido(
            String numero,
            String cliente,
            List<Producto> productos,
            String direccionEntrega,
            String metodoPago) {

        this.numero = numero;
        this.cliente = cliente;
        this.productos = productos;
        this.direccionEntrega = direccionEntrega;
        this.metodoPago = metodoPago;
    }

    /*
    Pedido(...)
    Pedido(..., direccion)
    Pedido(..., direccion, metodoPago)
    Pedido(..., direccion, metodoPago, descuento)
    Pedido(..., direccion, metodoPago, descuento, envioExpress)
    * */
}