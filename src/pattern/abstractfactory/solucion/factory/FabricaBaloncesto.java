package pattern.abstractfactory.solucion.factory;// ============================================================

import pattern.abstractfactory.solucion.products.Camiseta;
import pattern.abstractfactory.solucion.products.CamisetaBaloncesto;
import pattern.abstractfactory.solucion.products.Zapatos;
import pattern.abstractfactory.solucion.products.ZapatosBaloncesto;

/** FACTORY CONCRETA: BALONCESTO
// ============================================================

// Esta fábrica crea únicamente productos de la familia baloncesto.
*/
public class FabricaBaloncesto implements FabricaDeportiva {

    @Override
    public Zapatos crearZapatos() {
        return new ZapatosBaloncesto();
    }

    @Override
    public Camiseta crearCamiseta() {
        return new CamisetaBaloncesto();
    }
}