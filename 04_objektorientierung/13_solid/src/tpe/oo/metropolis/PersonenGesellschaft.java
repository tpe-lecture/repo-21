package tpe.oo.metropolis;

public class PersonenGesellschaft extends Unternehmen {
    Bürger[] inhaber;

    public static int gewinn = 0;

    public void errechneGewinn() {
        for (int i = 0; i < inhaber.length; i++) {
gewinn+=inhaber[i].
        }
    }
}
