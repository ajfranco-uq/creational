package pattern.abstractfactory.ejercicio;

import pattern.abstractfactory.ejercicio.factory.FabricaAmbiente;
import pattern.abstractfactory.ejercicio.notification.Notificacion;
import pattern.abstractfactory.ejercicio.product.Configuracion;
import pattern.abstractfactory.ejercicio.server.Servidor;

public class Aplicacion {

    private Configuracion configuracion;
    private Servidor servidor;
    private Notificacion notificacion;

    public Aplicacion(FabricaAmbiente fabrica) {

        // Todos los productos vienen de la misma fábrica.
        configuracion = fabrica.crearConfiguracion();
        servidor = fabrica.crearServidor();
        notificacion = fabrica.crearNotificacion();
    }

    public void iniciar() {

        configuracion.mostrarDatos();

        servidor.conectar();

        notificacion.enviar("Aplicación iniciada");
    }
}