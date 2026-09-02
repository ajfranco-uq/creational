package pattern.builder.solucion;

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


    private Pedido(Builder builder) {

        this.numero = builder.numero;
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.direccionEntrega = builder.direccionEntrega;
        this.metodoPago = builder.metodoPago;
        this.descuento = builder.descuento;
        this.envioExpress = builder.envioExpress;
        this.observaciones = builder.observaciones;
        this.notificarCliente = builder.notificarCliente;
    }

    public static class Builder {

        private String numero;
        private String cliente;
        private List<Producto> productos;
        private String direccionEntrega;
        private String metodoPago = "EFECTIVO";
        private double descuento = 0;
        private boolean envioExpress = false;
        private String observaciones;
        private boolean notificarCliente = true;

        public Builder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder cliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder productos(List<Producto> productos) {
            this.productos = productos;
            return this;
        }

        public Builder direccionEntrega(String direccionEntrega) {
            this.direccionEntrega = direccionEntrega;
            return this;
        }

        public Builder metodoPago(String metodoPago) {
            this.metodoPago = metodoPago;
            return this;
        }

        public Builder descuento(double descuento) {
            this.descuento = descuento;
            return this;
        }

        public Builder envioExpress(boolean envioExpress) {
            this.envioExpress = envioExpress;
            return this;
        }

        public Builder observaciones(String observaciones) {
            this.observaciones = observaciones;
            return this;
        }

        public Builder notificarCliente(boolean notificarCliente) {
            this.notificarCliente = notificarCliente;
            return this;
        }

        public Pedido build() {

            //Aparte de simplemete construir el pattern.builder, también podemos agrear validaciones básicas

            if (numero == null || numero.isBlank()) {
                throw new IllegalArgumentException(
                    "El número del pedido es obligatorio"
                );
            }

            if (cliente == null || cliente.isBlank()) {
                throw new IllegalArgumentException(
                    "El cliente es obligatorio"
                );
            }

            if (productos == null || productos.isEmpty()) {
                throw new IllegalArgumentException(
                    "El pedido debe tener productos"
                );
            }

            return new Pedido(this);
        }
    }
}