import java.util.ArrayList;
import java.util.List;

public class Main_Verem {
    public static void main(String[] args) {
        Verem v = new Verem();

        System.out.println(v);
        System.out.println(v.ures());

        v.betesz(1);
        v.betesz(4);
        v.betesz(5);

        System.out.println(v);

        System.out.println(v.meret());
        System.out.println(v.ures());

        int x = v.kivesz();
        System.out.println(x);
        System.out.println(v);

        v.kivesz();
        v.kivesz();

        x = v.kivesz();
        System.out.println(x);
    }
}

class Verem {
    private List<Integer> adat;

    public Verem() {
        this.adat = new ArrayList<>();
    }

    public boolean ures() {
        return adat.isEmpty();
    }

    public void betesz(int szam) {
        this.adat.add(szam);
    }

    public int meret() {
        return this.adat.size();
    }

    public int kivesz() {
        if (meret() == 0) {
            System.out.println("most már üres");
            return -1; // Ezzel jelezük hogy semmi nincs benne
        }
        int lista_vege = meret() - 1;
        int szam = this.adat.get(lista_vege);

        adat.remove(lista_vege);

        return szam;
    }

    @Override
    // Python féle
    // public String toString() {
    // String szamok = "";
    //
    // for (int i : adat) {
    // szamok += i + " ";
    // }
    //
    // return "[" + szamok;
    // }

    // Java házi féle
    public String toString() {
        return "Verem(" + this.adat.toString().replace("]", "") + ")";
    }
}
