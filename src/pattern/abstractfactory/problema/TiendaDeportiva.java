package pattern.abstractfactory.problema;

class TiendaDeportiva {

    public void mostrarProductos(String deporte) {

        if (deporte.equals("futbol")) {

            // La tienda conoce directamente las clases concretas
            ZapatosFutbol zapatos = new ZapatosFutbol();
            CamisetaFutbol camiseta = new CamisetaFutbol();

            zapatos.mostrar();
            camiseta.mostrar();

        } else if (deporte.equals("baloncesto")) {

            // También debe conocer las clases de baloncesto
            ZapatosBaloncesto zapatos = new ZapatosBaloncesto();
            CamisetaBaloncesto camiseta = new CamisetaBaloncesto();

            zapatos.mostrar();
            camiseta.mostrar();
        }
    }
}