package pattern.prototype.problema;

public class Main {

    public static void main(String[] args) {

        Reporte enero = new Reporte(
                "Reporte de ventas - Enero",
                "Andrés",
                "Contenido del reporte",
                "PDF",
                true
        );

        Reporte febrero = new Reporte(
                "Reporte de ventas - Febrero",
                "Andrés",
                "Contenido del reporte",
                "PDF",
                true
        );

        Reporte marzo = new Reporte(
                "Reporte de ventas - Marzo",
                "Andrés",
                "Contenido del reporte",
                "PDF",
                true
        );

        enero.mostrar();
        System.out.println("---------------------------");
        febrero.mostrar();
        System.out.println("---------------------------");
        marzo.mostrar();
    }
}