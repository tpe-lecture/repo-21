package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Fütterung der Tiere.
 */
public class Futterstelle {

    /**
     *
     * @param zooTier Referenz des Typs ZooTier
     */
    public void gibFutter(ZooTier zooTier) {
        zooTier.fuettern();
    }
}
