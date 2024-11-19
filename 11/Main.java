import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int input = Integer.parseInt(scanner.nextLine());
            System.out.println(input);
            // } catch (NumberFormatException e) {
            // System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
