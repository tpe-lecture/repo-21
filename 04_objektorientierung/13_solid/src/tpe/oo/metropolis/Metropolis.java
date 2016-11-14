package tpe.oo.metropolis;

public class Metropolis {

    public static void main(String[] args) {
        Schurken azog = new Schurken("Azog der Schänder", "Orkismus", 27990);
        Schurken hannibal = new Schurken("Hannibal Lecter", "Kannibalismus",
                19910);
        Schurken onox = new Schurken("Onox", "Legendismus", 270201);
        Schurken[] mitgSynd1 = { azog, hannibal };

        Syndikat syndikat1 = new Syndikat("Syndikat der Superschurken",
                mitgSynd1);
        Steuerpflichtig[] steuerpflichtige = { syndikat1, azog, hannibal,
                onox };

        Finanzamt finanz = new Finanzamt(steuerpflichtige);
        System.out.println("Steuer: " + finanz.steuer()+ " Metrodollar");

    }

}
