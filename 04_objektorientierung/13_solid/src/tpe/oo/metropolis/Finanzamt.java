package tpe.oo.metropolis;

public class Finanzamt {
    Steuerpflichtig[] steuerpflichtige;

    public Finanzamt(Steuerpflichtig[] steuerpflichtige) {
        this.steuerpflichtige = steuerpflichtige;
    }

    public int steuer() {
        int steuer = 0;
        for (int i = 0; i < steuerpflichtige.length; i++) {
            steuer += steuerpflichtige[i].steuer();
        }
        return steuer;
    }

}
