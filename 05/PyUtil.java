import java.util.Scanner;

public class PyUtil {
    private PyUtil() {
        // üres konstrucktor
    }

    static String input() {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        return text;
    }

    static String input(String prompt) {
        System.out.print(prompt);

        String text = input();

        
        return text;
    }
}
