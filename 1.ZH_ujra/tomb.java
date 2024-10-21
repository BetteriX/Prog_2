import java.util.Arrays;

public class tomb {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5, 6, 8 };

        int result[] = getFirstAndLast(t);
        String result_str = Arrays.toString(result);

        System.out.println(result_str);
    }

    static int[] getFirstAndLast(int[] t) {
        int[] first_last = new int[2];

        first_last[0] = t[0];
        first_last[1] = t[t.length - 1];

        return first_last;
    }
}
