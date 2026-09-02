package pattern.prototype.solucion.abstracto;

public abstract class Reporte { //Clase abstracta

    protected String titulo;
    protected String autor;
    protected String contenido;
    protected String formato;
    protected boolean incluirGraficos;

    // Constructor normal
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

    // Constructor de copia
    public Reporte(Reporte objetivo) {

        if (objetivo != null) {
            this.titulo = objetivo.titulo;
            this.autor = objetivo.autor;
            this.contenido = objetivo.contenido;
            this.formato = objetivo.formato;
            this.incluirGraficos = objetivo.incluirGraficos;
        }
    }

    // Método Prototype
    public abstract Reporte clonar();

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Formato: " + formato);
        System.out.println("Gráficos: " + incluirGraficos);
    }
}