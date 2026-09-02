package pattern.prototype.solucion.ejercicio;

public class Configuracion implements Prototype {

    private String nombreEmpresa;
    private String moneda;
    private double impuesto;
    private String rutaReportes;
    private String urlServidor;
    private int puerto;
    private boolean logs;
    private boolean notificaciones;

    public Configuracion(
            String nombreEmpresa,
            String moneda,
            double impuesto,
            String rutaReportes,
            String urlServidor,
            int puerto,
            boolean logs,
            boolean notificaciones) {

        this.nombreEmpresa = nombreEmpresa;
        this.moneda = moneda;
        this.impuesto = impuesto;
        this.rutaReportes = rutaReportes;
        this.urlServidor = urlServidor;
        this.puerto = puerto;
        this.logs = logs;
        this.notificaciones = notificaciones;
    }

    @Override
    public Configuracion clone() {
        return new Configuracion(
                nombreEmpresa,
                moneda,
                impuesto,
                rutaReportes,
                urlServidor,
                puerto,
                logs,
                notificaciones
        );
    }

    // Getters y setters

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

    public String getUrlServidor() {
        return urlServidor;
    }

    public void setUrlServidor(String urlServidor) {
        this.urlServidor = urlServidor;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public boolean isLogs() {
        return logs;
    }

    public void setLogs(boolean logs) {
        this.logs = logs;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(boolean notificaciones) {
        this.notificaciones = notificaciones;
    }
}