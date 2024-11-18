import java.util.Random;

public class Randrange_1 {
    private final static Random r = new Random();

    public static void main(String[] args) {
        int x = randrange(70, 72);

        System.out.println(x);
    }

    // [also, felso) a felso határ nincsen benne
    public static int randrange(int also, int felso) {
        int intervallum = felso - also;
        int veletlen = r.nextInt(intervallum);

        return also + veletlen;
    }

}
