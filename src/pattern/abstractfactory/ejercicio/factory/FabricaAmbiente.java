package pattern.abstractfactory.ejercicio.factory;

import pattern.abstractfactory.ejercicio.notification.Notificacion;
import pattern.abstractfactory.ejercicio.product.Configuracion;
import pattern.abstractfactory.ejercicio.server.Servidor;

public interface FabricaAmbiente {

    Configuracion crearConfiguracion();

    Servidor crearServidor();

    Notificacion crearNotificacion();
}