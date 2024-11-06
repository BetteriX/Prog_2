import java.util.Arrays;

public class SplitAndJoin {
    public static void main(String[] args) {
        String s = "aa:bb:cc:dd";
        String[] words = s.split(":");
        System.out.println(Arrays.toString(words));

        s = "         aa        44         g5     ";
        String[] result = s.split(" ");
        System.out.println(Arrays.toString(result));

        String[] result2 = s.split("\\s+");
        System.out.println(Arrays.toString(result2));

        String[] result3 = s.trim().split("\\s+");
        System.out.println(Arrays.toString(result3));

        String[] elems = { "aa", "bb", "cc" };
        String result4 = String.join(":", elems);
        System.out.println(result4);
    }
}
