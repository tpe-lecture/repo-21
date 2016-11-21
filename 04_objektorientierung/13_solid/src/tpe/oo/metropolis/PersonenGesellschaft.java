package tpe.oo.metropolis;

public class PersonenGesellschaft extends Unternehmen {
    Bürger[] inhaber;

    public int gewerbesteuer() {
        double steuer = (gewinn - 800) * STEUERSATZ;
        return (int) steuer;
    }

    public int einkommenssteuer() {
        return gewinn;

    }

    @Override
    public int steuer() {
        return 0;
    }

}
