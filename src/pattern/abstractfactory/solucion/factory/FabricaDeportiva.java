package pattern.abstractfactory.solucion.factory;// ============================================================

import pattern.abstractfactory.solucion.products.Camiseta;
import pattern.abstractfactory.solucion.products.Zapatos;

/** ABSTRACT FACTORY
// ============================================================

 La fábrica define TODOS los productos que puede crear dentro de una familia.

 En este caso, una familia deportiva tiene:
 - Zapatos
 - Camiseta
*/
public interface FabricaDeportiva {

    Zapatos crearZapatos();

    Camiseta crearCamiseta();
}