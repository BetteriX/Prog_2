import java.util.Scanner;

public class feladat {

    public static String input(String prompt) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String szoveg = scanner.nextLine();
        return szoveg;

    }

    public static boolean checkError(String s, String s2) {

        if (s.equals("") || s2.equals("")) {
            System.out.println("Ne üreset küldjön be!");
            return true;
        }

        for (char c : s.toCharArray()) {

            if (!Character.isLetter(c)) {
                System.out.println("Számot ne adjon meg!");
                return true;
            }

        }

        for (char c : s2.toCharArray()) {

            if (!Character.isLetter(c)) {
                System.out.println("Számot ne adjon meg!");
                return true;
            }
        }

        if (s.length() != s2.length()) {
            System.out.println("Ugyanolyan hosszúságú szöveget adjon meg!");
            return true;
        }

        return false;
    }

    public static int betu_egyezes(String s, String s2) {

        int count = 0;

        char[] szoveg = s.toCharArray();
        char[] szoveg2 = s2.toCharArray();

        for (int i = 0; i < szoveg.length; i++) {

            if (Character.toLowerCase(szoveg[i]) == Character.toLowerCase(szoveg2[i])) {
                count++;
            }

        }

        return count;

    }

    public static void main(String[] args) {

        String szoveg = input("Adjon meg egy szoveget: ");
        String szoveg2 = input("Adjon meg egy másik szöveget: ");

        if (checkError(szoveg, szoveg2)) {
            System.exit(1);
        } else {

            System.out.println("Ugyanaz a betű ugyanazon a helyen: " + betu_egyezes(szoveg, szoveg2));

        }

    }

}