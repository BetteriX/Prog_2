import java.util.Scanner;

public class Main {

    public static void CheckError(String num) {
        for (char c : num.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Nem lehet benne betű!");
                System.exit(1);
            }
        }

        int hossz = num.length();
        if (hossz % 4 != 0) {
            System.out.println("A szám nem megfelelő! 4-el osztható sorrendbe add meg!");
            System.exit(2);
        }
    }

    public static void Solve(String num) {
        int i = 0;
        int hossz = num.length();
        while (i < hossz) {
            String negy_szamsor = num.substring(i, i + 4); // szamok[0] -> ... szamok[3] ...

            int total = 0;
            for (char c : negy_szamsor.toCharArray()) {
                total += Character.getNumericValue(c);
            }

            System.out.println(total + " ");

            i += 4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // szamsor -> ha osztható 4-el akkor tovább megy
        // len(szamsor) -> 16->4-4-4-4 (4-> +)
        System.out.print("Kérem adjon meg egy számot: ");
        String szamok = scanner.nextLine();
        scanner.close();

        CheckError(szamok);

        Solve(szamok);
    }
}
