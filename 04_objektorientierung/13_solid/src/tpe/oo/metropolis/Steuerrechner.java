package tpe.oo.metropolis;

public class Steuerrechner {
    public int gewSteuer(Steuerpflichtige x) {
        if (x instanceof PersonenGesellschaft) {

        }
        return 0;

    }

    public int körpSteuer(Steuerpflichtige[] x) {
        double steuern = 0;
        for (int i = 0; i < x.length; i++) {
            steuern += (((Schurken) x[i]).getEinkommen() * 0.15);
        }
        return (int) steuern;

    }

    public int einkSteuer(Steuerpflichtige x) {
        double steuer = 0;
        int einkommen = ((Schurken) x).getEinkommen();
        if (einkommen >= 20000) {
            steuer += 20000 * 0.08;
            einkommen -= 20000;
            if (einkommen >= 40000) {
                steuer += 40000 * 0.15;
                einkommen -= 40000;
                if (einkommen == 60000) {
                    steuer += 60000 * 0.25;
                    einkommen -= 60000;
                    if (einkommen == 0) {
                        return (int) steuer;
                    }
                    else {
                        steuer += einkommen * 0.4;
                        return (int) steuer;
                    }
                }
                else {
                    steuer += einkommen * 0.25;
                    return (int) steuer;
                }

            }
            else {
                steuer += einkommen * 0.15;
                return (int) steuer;
            }

        }
        else {
            steuer = einkommen * 0.08;
            return (int) steuer;
        }
    }
}
