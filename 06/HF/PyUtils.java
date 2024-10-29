import java.util.Scanner;

public class PyUtils {
    private PyUtils() {

    }

    public static String input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Text: ");
        String text = scanner.nextLine();

        scanner.close();

        return text;
    }
}
