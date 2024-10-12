import java.util.Scanner;

public class PyUtils {
    private PyUtils() {

    }

    public static String input(String szoveg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Neved: ");
        String nev = scanner.nextLine();

        scanner.close();

        return nev;
    }
}
