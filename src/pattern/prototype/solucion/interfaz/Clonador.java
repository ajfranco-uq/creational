package pattern.prototype.solucion.interfaz;

public class Clonador implements  ReportePrototype{

    private String name;

    public Clonador(String name){
        this.name=name;
    }

    @Override
    public Clonador clonar() {
        return new Clonador(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
