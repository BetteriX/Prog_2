import java.util.List;

public class RandUtils {
    private RandUtils() {

    }

    public static int randint(int also, int felso) {
        int intervallum = felso - also + 1;
        int veletlen = Main.r.nextInt(intervallum);

        return also + veletlen;
    }

    public static int randrange(int also, int felso) {
        int intervallum = felso - also;
        int veletlen = Main.r.nextInt(intervallum);

        return also + veletlen;
    }

    public static int choice(List<Integer> l) {
        return randint(0, l.size() + 1);
    }
}
