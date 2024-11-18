class Negyzet {
    public static void main(String[] args) {
        test_negyzet();
        System.out.println("done");
    }

    public int hossz;

    public Negyzet(int hossz) {
        this.hossz = hossz;
    }

    public int kerulet() {
        return 4 * hossz;
    }

    public int terulet() {
        return hossz * hossz;
    }

    public static void test_negyzet() {
        Negyzet n = new Negyzet(2);

        assert n.kerulet() == 8;
        // assert n.kerulet() == 8;
        assert n.terulet() == 4;
    }
}
