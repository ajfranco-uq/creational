package pattern.abstractfactory.ejercicio.factory;

import pattern.abstractfactory.ejercicio.notification.Notificacion;
import pattern.abstractfactory.ejercicio.notification.NotificacionReal;
import pattern.abstractfactory.ejercicio.product.Configuracion;
import pattern.abstractfactory.ejercicio.product.ConfiguracionProduccion;
import pattern.abstractfactory.ejercicio.server.Servidor;
import pattern.abstractfactory.ejercicio.server.ServidorProduccion;

public class FabricaProduccion implements FabricaAmbiente {

    @Override
    public Configuracion crearConfiguracion() {
        return new ConfiguracionProduccion();
    }

    @Override
    public Servidor crearServidor() {
        return new ServidorProduccion();
    }

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionReal();
    }
}