public class Befektetes implements Comparable<Befektetes> {
    private double toke;
    private int futamido;
    private double kamat;

    public Befektetes(double toke, int futamido, double kamat) {
        this.toke = toke;
        this.futamido = futamido;
        this.kamat = kamat;
    }

    public double get_toke() {
        return this.toke;
    }

    public int get_futamido() {
        return this.futamido;
    }

    public double get_kamat() {
        return this.kamat;
    }

    public double getLejaratiToke() {
        return this.toke * Math.pow(1 + this.kamat / 100, this.futamido);
    }

    // Fontos! Ez a duplikáció elkerülésére van (d.)
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    // Fontos! Szintén a duplikációra van (d.)
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Befektetes)) {
            return false;
        } else {
            // Fontos! Típuskényszerítés
            Befektetes b = (Befektetes) obj;

            return this.getLejaratiToke() == b.getLejaratiToke();
        }
    }

    // Fontos! Ez nővekvő sorrendben rakja a Collection.sort()-om

    @Override
    public int compareTo(Befektetes o) {
        return Double.compare(this.getLejaratiToke(), o.getLejaratiToke());
    }

    @Override
    public String toString() {
        return "Befektetes{" + "toke=" + toke + ", futamido=" + futamido + ", kamat=" + kamat + '}';
    }
}