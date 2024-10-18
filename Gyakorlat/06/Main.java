public class Main {
    public static void main(String[] args) {
        Szakacs szakacs = new Szakacs();
        szakacs.keszitSpecialitas();
        // szakacs.keszitFoetel();
        // szakacs.keszitSpecialitas();

        MagyarSzakacs magyarszakacs = new MagyarSzakacs();
        magyarszakacs.keszitSpecialitas();
        // magyarszakacs.keszitleves();
        // magyarszakacs.keszitFoetel();
    }
}
