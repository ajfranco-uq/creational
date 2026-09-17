package pattern.abstractfactory.ejercicio.factory;

import pattern.abstractfactory.ejercicio.notification.Notificacion;
import pattern.abstractfactory.ejercicio.notification.NotificacionSimulada;
import pattern.abstractfactory.ejercicio.product.Configuracion;
import pattern.abstractfactory.ejercicio.product.ConfiguracionDesarrollo;
import pattern.abstractfactory.ejercicio.server.Servidor;
import pattern.abstractfactory.ejercicio.server.ServidorLocal;

public class FabricaDesarrollo implements FabricaAmbiente {

    @Override
    public Configuracion crearConfiguracion() {
        return new ConfiguracionDesarrollo();
    }

    @Override
    public Servidor crearServidor() {
        return new ServidorLocal();
    }

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionSimulada();
    }
}