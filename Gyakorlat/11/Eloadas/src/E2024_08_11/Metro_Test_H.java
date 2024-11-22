package E2024_08_11;

 class Szerelvény {
    protected int kocsikSzáma;
    protected boolean földAlatti;

    public Szerelvény(int kocsikSzáma) {
        this(kocsikSzáma, false);
    }

    public Szerelvény(int kocsikSzáma, boolean földAlatti) {
        this.kocsikSzáma = kocsikSzáma;
        this.földAlatti = földAlatti;
        System.out.println("Uj szerelveny: " + this);
    }

    @Override
    public String toString() {
        return "szerelveny (" + kocsikSzáma + " kocsi, " + (földAlatti ? "foldalatti" : "felszini") + ")";
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
        System.out.println("Uj metroszerelveny: " + this);
    }

    @Override
    public String toString() {
        return "metro (" + kocsikSzáma + " kocsi, " + (földAlatti ? "foldalatti" : "felszini") + ")";
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
        System.out.println("M + Sz specialis: " + this + " + " + sz + " foldAlatti=" + földAlatti);
        return new MetróSzerelvény(kocsikSzáma + sz.kocsikSzáma);
    }
    
    @Override
    public boolean equals(Object obj)
    {
       if(obj == null || !(obj instanceof MetróSzerelvény))
               {
                  return false;
               }
        MetróSzerelvény m = (MetróSzerelvény)obj;
        return this.kocsikSzáma == m.kocsikSzáma;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
}

class Metro_Test_H {
    public static void main(String[] args) {
        Szerelvény szsz = new Szerelvény(3);
        Szerelvény szm = new MetróSzerelvény(4);
        MetróSzerelvény mm = new MetróSzerelvény(5);
        
        System.out.println("");
        System.out.println(szsz.összefűz(szm));
        System.out.println("");
        System.out.println(szm.összefűz(szsz));
        System.out.println("");
        System.out.println(szm.összefűz(mm));
        
        
        
        
        
        
        
                
                
                

    }
}

