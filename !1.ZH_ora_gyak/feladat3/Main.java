import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;

        do {
            String input = input("Adjon meg szavakat (pl.: cat tail leopard dog): ");
            String[] text = input.split(" ");

            if (checkError(text)) {
                System.out.println("");
            } else {
                System.out.println(isChained(text) ? "A szavak láncoltak." : "A szavak nem lácoltak.");

                if (isChained(text)) {
                    flag = false;
                }
            }
        } while (flag);
    }

    static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);

        String text = scanner.nextLine();
        return text;
    }

    static boolean checkError(String[] text) {
        if (text.length == 1 || text[0].equals("")) {
            System.out.println("Hiba! A bemenet nem lehet üres. Kérem, adjon meg egy érvényes szólistát!");
            return true;
        }

        for (String s : text) {
            for (char c : s.toCharArray()) {
                if (!Character.isLetter(c)) {
                    System.out.println(
                            "Hiba! A bemenet csak betűket és szóközöket tartalmazhat. Kérem, adjon meg egy érvényes szólistát!");
                    return true;
                }
            }
        }

        return false;
    }

    static boolean isChained(String[] text) {
        String lastWord = text[0];

        for (int index = 1; index < text.length; index++) {
            // String[2] = {"Macska", "Kutya"} -> Nem láncolt
            // lastWord = "Macska"

            // text[index] -> "Kutya"
            // text[index].toLowerCase().charAt(0) -> "k"

            // if (!lastWord.toLowerCase().endsWith("" +
            // text[index].toLowerCase().charAt(0)))
            if (!lastWord.toLowerCase().endsWith(Character.toString(text[index].toLowerCase().charAt(0)))) {
                return false;
            }

            // lastWord+1 -> "Kutya"
            lastWord = text[index];
        }

        return true;
    }
}
