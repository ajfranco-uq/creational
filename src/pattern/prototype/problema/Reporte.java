package pattern.prototype.problema;

public class Reporte {

    private String titulo;
    private String autor;
    private String contenido;
    private String formato;
    private boolean incluirGraficos;

    public Reporte(
            String titulo,
            String autor,
            String contenido,
            String formato,
            boolean incluirGraficos) {

        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
        this.formato = formato;
        this.incluirGraficos = incluirGraficos;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Formato: " + formato);
        System.out.println("Gráficos: " + incluirGraficos);
    }
}