package pattern.prototype.solucion.abstracto;

public class Main {

    public static void main(String[] args) {

        // Creamos el objeto original
        Reporte reporteBase = new ReporteVentas(
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
    }
}