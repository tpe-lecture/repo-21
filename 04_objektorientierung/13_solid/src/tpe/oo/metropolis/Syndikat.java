package tpe.oo.metropolis;

public class Syndikat {
    private String name;

    private Schurken[] mitglieder;
    private int gewinn;

    public Syndikat(String name, int größe) {
        this.name = name;
        setMitglieder(new Schurken[größe]);

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

}
