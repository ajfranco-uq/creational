package pattern.abstractfactory.ejercicio.factory;

import pattern.abstractfactory.ejercicio.notification.Notificacion;
import pattern.abstractfactory.ejercicio.notification.NotificacionPruebas;
import pattern.abstractfactory.ejercicio.product.Configuracion;
import pattern.abstractfactory.ejercicio.product.ConfiguracionPruebas;
import pattern.abstractfactory.ejercicio.server.Servidor;
import pattern.abstractfactory.ejercicio.server.ServidorPruebas;

public class FabricaPruebas implements FabricaAmbiente {

    @Override
    public Configuracion crearConfiguracion() {
        return new ConfiguracionPruebas();
    }

    @Override
    public Servidor crearServidor() {
        return new ServidorPruebas();
    }

    @Override
    public Notificacion crearNotificacion() {
        return new NotificacionPruebas();
    }
}