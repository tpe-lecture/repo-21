package tpe.oo.metropolis;

public interface Einkommenssteuerpflichtig extends Steuerpflichtig {
    public static double STEUERSATZ1 = 0.08, STEUERSATZ2 = 0.15,
            STEUERSATZ3 = 0.25;

    public int einkommensteuer();
}
