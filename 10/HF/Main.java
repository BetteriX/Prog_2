import java.util.List;
import java.util.Random;

public class Main {
    // Nem lehet a RandUtils-ban mert költséges
    public final static Random r = new Random();

    public static void main(String[] args) {
        int x1 = RandUtils.randint(6, 12);
        int x2 = RandUtils.randrange(6, 12);
        int x3 = RandUtils.choice(List.of(1, 2, 3, 4, 5, 6));

        System.out.println("HF #2: " + x1 + " " + x2);
        System.out.println("HF #3: " + x3);
    }
}
