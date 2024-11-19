import java.util.Random;

public class Lift implements Mozog {
    private int emeletek_szama;
    private int aktualis_emelet;

    public Lift(int emeletek_szama) {
        this.emeletek_szama = emeletek_szama;

        Random rnd = new Random();
        this.aktualis_emelet = rnd.nextInt(emeletek_szama) + 1;
    }

    public int Get_emeletek_szama() {
        return this.emeletek_szama;
    }

    public int Get_aktualis_emelet() {
        return this.aktualis_emelet;
    }

    @Override
    public void felfele() throws HibasIranyException, Exception {
        Random rnd = new Random();
        int elromlot = 99;
        int random_szam = rnd.nextInt(100);

        if (elromlot == random_szam) {
            throw new Exception("A lift elromlott");
        }

        if (this.aktualis_emelet < this.emeletek_szama) {
            this.aktualis_emelet++;
        } else {
            throw new HibasIranyException(this.emeletek_szama, "Hibás irány felfele");
        }
    }

    @Override
    public void lefele() throws HibasIranyException, Exception {
        Random rnd = new Random();
        int elromlot = 99;
        int random_szam = rnd.nextInt(100);

        if (elromlot == random_szam) {
            throw new Exception("A lift elromlott");
        }

        if (this.aktualis_emelet > 1) {
            this.aktualis_emelet--;
        } else {
            throw new HibasIranyException(this.emeletek_szama, "Hibás irány lefele");
        }
    }

    @Override
    public String toString() {
        return "Lift [emeletek száma=" + emeletek_szama + ", aktuális emelet=" + aktualis_emelet + "]";
    }
}
