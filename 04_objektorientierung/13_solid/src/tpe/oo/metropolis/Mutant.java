package tpe.oo.metropolis;

public abstract class Mutant extends Einwohner {
    private String mutation;

    public Mutant(String name, String mutation) {
        super(name);
        this.mutation = mutation;
    }

    public String getMutation() {
        return mutation;
    }

}
