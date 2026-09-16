package pattern.prototype.solucion.interfaz;


public class Main {

    public static void main(String[] args) {

        // Creamos el objeto original
        Reporte reporteBase = new Reporte(
                "Reporte de ventas",
                "Andrés",
                "Contenido del reporte",
                "PDF",
                true
        );

        // Clonamos el objeto
        Reporte enero = reporteBase.clonar();

        // Modificamos la copia
        enero.setTitulo("Reporte de ventas - Enero");

        reporteBase.mostrar();

        System.out.println("--------------");

        enero.mostrar();


        Clonador cl = new Clonador("a");
        Clonador cl2 = cl.clonar();

        cl.setName("asdf");
        cl2.setName("sdfg");

        //.....




    }
}