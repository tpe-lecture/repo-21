package tpe.oo.metropolis;

public class Schurken extends Mutant implements Einkommenssteuerpflichtig {
    private Superkraft schwäche;
    private int einkommen;

    public Schurken(String name, String mutation, Superkraft superkraft,
            int einkommen) {
        super(name, mutation);
        this.schwäche = superkraft;
        this.einkommen = einkommen;
    }

    public Schurken(String name, String mutation, int einkommen) {
        super(name, mutation);
        this.einkommen = einkommen;
    }

    public Superkraft getSuperkraft() {
        return schwäche;
    }

    public int getEinkommen() {
        return einkommen;
    }

    @Override
    public int steuer() {
        return einkommenssteuer();
    }

    @Override
    public int einkommenssteuer() {
        double steuer = 0;
        if (einkommen > 20000) {
            steuer += 20000 * STEUERSATZ1;
            einkommen -= 20000;
            if (einkommen > 40000) {
                steuer += 40000 * STEUERSATZ2;
                einkommen -= 40000;
                if (einkommen > 60000) {
                    steuer += 60000 * STEUERSATZ3;
                    einkommen -= 60000;
                    steuer += einkommen * 0.4;
                    return (int) steuer;
                }
                else {
                    steuer += einkommen * STEUERSATZ3;
                    return (int) steuer;
                }
            }
            else {
                steuer += einkommen * STEUERSATZ2;
                return (int) steuer;
            }
        }
        else {
            steuer += einkommen * STEUERSATZ1;
            return (int) steuer;
        }
    }

}
