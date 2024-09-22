class Negyzet {
    public int hossz;

    // Konstruktor
    public Negyzet(int hossz){
        this.hossz = hossz;
    }

    
    public int kerulet(){
        return 4 * hossz;
    }

    public int terulet(){
        return hossz * hossz;
    }
}
