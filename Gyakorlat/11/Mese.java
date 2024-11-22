import java.util.List;

public class Mese implements Comparable<Mese> {
    private String cim;
    private List<String> szereplok;

    public Mese(String cim, List<String> szereplok) {
        this.cim = cim;
        this.szereplok = szereplok;
    }

    public String get_cim() {
        return this.cim;
    }

    public List<String> get_szereplok() {
        return this.szereplok;
    }

    public int szereplok_szama() {
        return this.szereplok.size();
    }

    @Override
    public String toString() {
        return cim + ": " + this.szereplok.size();
    }

    // Fontos! lesz a 2. ZH-ra!
    @Override
    public int compareTo(Mese o) {
        if (this.szereplok_szama() == o.szereplok_szama()) {
            return this.cim.compareTo(o.get_cim());
        } else {
            // -1 -el való szorzás akkor csökkenő sorrend
            // Ha nincs akkor növekvő
            return (-1) * Integer.compare(this.szereplok_szama(), o.szereplok_szama());
        }
    }
}
