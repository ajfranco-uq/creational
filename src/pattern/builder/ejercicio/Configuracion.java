package pattern.builder.ejercicio;

public class Configuracion {

    private final String nombreEmpresa;
    private final String moneda;
    private final double impuesto;
    private final String rutaReportes;
    private final String urlServidor;
    private final int puerto;
    private final boolean logs;
    private final boolean notificaciones;

    private Configuracion(Builder builder) {
        this.nombreEmpresa = builder.nombreEmpresa;
        this.moneda = builder.moneda;
        this.impuesto = builder.impuesto;
        this.rutaReportes = builder.rutaReportes;
        this.urlServidor = builder.urlServidor;
        this.puerto = builder.puerto;
        this.logs = builder.logs;
        this.notificaciones = builder.notificaciones;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public String getRutaReportes() {
        return rutaReportes;
    }

    public String getUrlServidor() {
        return urlServidor;
    }

    public int getPuerto() {
        return puerto;
    }

    public boolean isLogs() {
        return logs;
    }

    public boolean isNotificaciones() {
        return notificaciones;
    }

    public static class Builder {

        private String nombreEmpresa;
        private String moneda = "COP";
        private double impuesto = 19;
        private String rutaReportes = "/reportes";
        private String urlServidor;
        private int puerto = 8080;
        private boolean logs = false;
        private boolean notificaciones = false;

        public Builder nombreEmpresa(String nombreEmpresa) {
            this.nombreEmpresa = nombreEmpresa;
            return this;
        }

        public Builder moneda(String moneda) {
            this.moneda = moneda;
            return this;
        }

        public Builder impuesto(double impuesto) {
            this.impuesto = impuesto;
            return this;
        }

        public Builder rutaReportes(String rutaReportes) {
            this.rutaReportes = rutaReportes;
            return this;
        }

        public Builder urlServidor(String urlServidor) {
            this.urlServidor = urlServidor;
            return this;
        }

        public Builder puerto(int puerto) {
            this.puerto = puerto;
            return this;
        }

        public Builder logs(boolean logs) {
            this.logs = logs;
            return this;
        }

        public Builder notificaciones(boolean notificaciones) {
            this.notificaciones = notificaciones;
            return this;
        }

        public Configuracion build() {
            return new Configuracion(this);
        }
    }
}