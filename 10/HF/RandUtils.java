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
        int min = l.get(0);
        int max = l.get(0);

        for (int i : l) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }
        }

        // System.out.println(min + " " + max);
        return randint(min, max);
    }
}
