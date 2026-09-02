package pattern.prototype.solucion.abstracto;

public class ReporteVentas extends Reporte { //clase concreta que extiende de la clase abstracta Reporte

    public ReporteVentas(
            String titulo,
            String autor,
            String contenido,
            String formato,
            boolean incluirGraficos) {

        super(titulo, autor, contenido, formato, incluirGraficos); //clase padre
    }

    // Constructor de copia
    public ReporteVentas(ReporteVentas objetivo) {
        super(objetivo);
    }

    //Se sobreescribe el método clonar del padre
    @Override
    public Reporte clonar() {
        return new ReporteVentas(this);
    }
}