class Szerelvény {
    protected int kocsikSzáma;
    protected boolean földAlatti;

    public Szerelvény(int kocsikSzáma) {
        this(kocsikSzáma, false);
    }

    public Szerelvény(int kocsikSzáma, boolean földAlatti) {
        this.kocsikSzáma = kocsikSzáma;
        this.földAlatti = földAlatti;
        System.out.println("Új szerelvény: " + this);
    }

    @Override
    public String toString() {
        return "szerelvény (" + kocsikSzáma + " kocsi, " + (földAlatti ? "földalatti" : "felszíni") + ")";
    }

    // Eredeti összefűz metódus
    public Szerelvény összefűz(Szerelvény sz) {
        boolean b = földAlatti && sz.földAlatti;
        System.out.println("Sz + Sz: " + this + " + " + sz);
        return new Szerelvény(kocsikSzáma + sz.kocsikSzáma, b);
    }
}

class MetróSzerelvény extends Szerelvény {

    public MetróSzerelvény(int kocsikSzáma) {
        super(kocsikSzáma, true);
        System.out.println("Új metrószerelvény: " + this);
    }

    @Override
    public String toString() {
        return "metró (" + kocsikSzáma + " kocsi, " + (földAlatti ? "földalatti" : "felszíni") + ")";
    }

    @Override
    public Szerelvény összefűz(Szerelvény sz) {
        System.out.println("M + Sz: " + this + " + " + sz);
        return new Szerelvény(kocsikSzáma + sz.kocsikSzáma, sz.földAlatti);
    }

    // Metró specifikus összefűz metódus metró típusú szerelvényekhez
    public MetróSzerelvény összefűz(MetróSzerelvény m) {
        System.out.println("M + M: " + this + " + " + m);
        return new MetróSzerelvény(kocsikSzáma + m.kocsikSzáma);
    }

    // Új összefűz metódus egy adott kocsiszámmal
    public MetróSzerelvény összefűz(int kocsik) {
        System.out.println("M + kocsik: " + this + " + " + kocsik + " kocsi");
        return new MetróSzerelvény(kocsikSzáma + kocsik);
    }

    // Új összefűz metódus egy másik típusú objektummal
    public MetróSzerelvény összefűz(Szerelvény sz, boolean földAlatti) {
        System.out.println("M + Sz speciális: " + this + " + " + sz + " földAlatti=" + földAlatti);
        return new MetróSzerelvény(kocsikSzáma + sz.kocsikSzáma);
    }
}

class Metro_Test_H {
    public static void main(String[] args) {
        Szerelvény szsz = new Szerelvény(3);
        Szerelvény szm = new MetróSzerelvény(4);
        MetróSzerelvény mm = new MetróSzerelvény(5);
    }
}
