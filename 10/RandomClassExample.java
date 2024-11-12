import java.util.Random;

public class RandomClassExample {
    public static final Random r = new Random();

    public static void main(String[] args) {
        for (int index = 0; index < 5; index++) {
            System.out.println(r.nextInt(12));
        }
    }
}
