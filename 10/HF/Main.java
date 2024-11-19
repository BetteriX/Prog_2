import java.util.List;
import java.util.Random;

public class Main {
    // Nem lehet a RandUtils-ban mert költséges
    public final static Random r = new Random();

    public static void main(String[] args) {
        int x1 = RandUtils.randint(6, 12);
        int x2 = RandUtils.randrange(6, 12);

        // HashSet<Integer> hs = new HashSet<>();
        // for (int i = 0; i < 25; i++) {
        int x3 = RandUtils.choice(List.of(1, 2, 3, 4, 5, 6));
        // System.out.println(x3);
        // hs.add(x3);
        // }
        System.out.println("HF #2: " + x1 + " " + x2);
        System.out.println("HF #3: " + x3);
    }
}
