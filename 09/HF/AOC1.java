import java.util.List;

public class AOC1 {
    public static void main(String[] args) {
        List<Integer> digits = FileUtils.readFirstLineAsListOfDigits("day01.txt");

        int F_digit = digits.get(0);
        int total = 0;

        if (F_digit == digits.get(digits.size() - 1)) {
            total += F_digit;
        }

        for (int i = 0; i < digits.size() - 1; i++) {
            int first_digit = digits.get(i);
            int second_digit = digits.get(i + 1);

            if (first_digit == second_digit) {
                total += second_digit;
            }
        }

        System.out.println(total);
    }
}
