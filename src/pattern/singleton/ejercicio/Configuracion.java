package pattern.singleton.ejercicio;

public class Configuracion {

    private static Configuracion instancia;

    private String nombreEmpresa;
    private String moneda;
    private double impuesto;
    private String rutaReportes;

    private Configuracion() {
        nombreEmpresa = "Mi Empresa";
        moneda = "COP";
        impuesto = 19;
        rutaReportes = "/reportes";
    }

    public static Configuracion getInstance() {

        if (instancia == null) {
            instancia = new Configuracion();
        }

        return instancia;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public String getRutaReportes() {
        return rutaReportes;
    }

    public void setRutaReportes(String rutaReportes) {
        this.rutaReportes = rutaReportes;
    }
}