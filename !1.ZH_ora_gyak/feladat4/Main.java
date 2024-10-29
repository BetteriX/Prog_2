import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filename = "example.txt";

        List<String> input = FileUtils.readLines(filename);

        int sum = 0;
        for (String s : input) {
            int firstDigit = -1;
            int lastDigit = -1;

            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    int number = Character.getNumericValue(c);
                    // System.out.println(number);
                    if (firstDigit == -1)
                        firstDigit = number;

                    lastDigit = number;
                }
            }

            sum += firstDigit * 10 + lastDigit;
        }

        System.out.println(sum);
    }
}
