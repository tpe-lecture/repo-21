package tpe.oo.metropolis;

public class Syndikat implements Körperschaftssteuerpflichtig {
    private String name;

    private Schurken[] mitglieder;
    private int gesamtgewinn;

    public Syndikat(String name, int größe) {
        this.name = name;
        setMitglieder(new Schurken[größe]);

    }

    public Syndikat(String name, Schurken[] mitglieder) {
        this.name = name;
        this.mitglieder = mitglieder;
    }

    public String getName() {
        return name;
    }

    public Schurken[] getMitglieder() {
        return mitglieder;
    }

    public Schurken getMitglieder(int platz) {
        return this.mitglieder[platz];
    }

    public void setMitglieder(Schurken[] mitglieder) {
        this.mitglieder = mitglieder;
    }

    public void setMitglieder(Schurken schurke, int platz) {
        this.mitglieder[platz] = schurke;
    }

    public int getGesamtgewinn() {
        for (int i = 0; i < mitglieder.length; i++) {
            gesamtgewinn += mitglieder[i].getEinkommen();
        }
        return gesamtgewinn;
    }

    @Override
    public int steuer() {
        return 0;
    }

    @Override
    public int koerperschaftssteuer() {
        return (int) (getGesamtgewinn() * 0.15);
    }

}
