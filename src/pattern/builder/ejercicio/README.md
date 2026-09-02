# Ejercicio

## Configuración de una aplicación

Una empresa está desarrollando una aplicación que puede ejecutarse en diferentes ambientes: desarrollo, pruebas y producción.

La aplicación tiene una clase Configuracion con diferentes parámetros:


```
Nombre de la empresa.
Moneda.
Impuesto.
Ruta de reportes.
URL del servidor.
Puerto.
Activar logs.
Activar notificaciones.

```

* Algunos parámetros son obligatorios y otros opcionales, por lo que no todas las configuraciones necesitan tener los mismos valores.
* Se desea poder crear diferentes configuraciones de forma clara y flexible, sin utilizar constructores con una gran cantidad de parámetros ni depender del orden de los argumentos.

```
Analice el problema, realice el diagrama UML con sus relaciones, aplique el patrón Builder para solucionarlo e impleméntarlo en Java.
```
