package tpe.oo.metropolis;

public class Schurken extends Mutant {
    private Superkraft schwäche;
    private int einkommen;

    public Schurken(String name, String mutation, Superkraft superkraft,
            int einkommen) {
        super(name, mutation);
        this.schwäche = superkraft;
        this.einkommen = einkommen;
    }

    public Superkraft getSuperkraft() {
        return schwäche;
    }

    public int getEinkommen() {
        return einkommen;
    }

}
