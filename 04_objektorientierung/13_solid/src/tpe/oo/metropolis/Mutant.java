package tpe.oo.metropolis;

public abstract class Mutant extends Einwohner {
    private String mutation;

    public Mutant(String name, String mutation) {
        this.mutation = mutation;
    }

    public String getMutation() {
        return mutation;
    }

}
