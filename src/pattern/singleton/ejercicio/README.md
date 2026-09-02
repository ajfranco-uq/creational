# Ejercicio

## Configuración de una aplicación

Una empresa está desarrollando una aplicación que tiene diferentes módulos: Pedidos, Facturación y Reportes.
Todos los módulos necesitan utilizar la configuración general de la aplicación, que contiene:

```
Nombre de la empresa
Moneda
Porcentaje de impuesto
Ruta de los reportes
```

* La configuración puede ser consultada y modificada por cualquiera de los módulos.
* Sin embargo, toda la aplicación debe utilizar exactamente la misma configuración.
* No debe ser posible que cada módulo cree su propia configuración.
* Por ejemplo, si el módulo de Facturación cambia el impuesto al 19%, el módulo de Pedidos debe ver también ese mismo valor.

```
Analice el problema, realice el diagrama UML con sus relaciones, aplique el patrón Singleton e implementarlo en Java.
```
