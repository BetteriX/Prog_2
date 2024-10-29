import java.util.Arrays;
import java.util.List;

public class Split_Join {
    public static void main(String[] args) {
        String s = "demo:x:1001:100::/home/demo:/bin/bash";
        String[] parts = s.split("[:\\s]+"); // \\s+ a felesleges whitespaceket eltunteti, hogyha [] rakjuk akkor többet
                                             // lehet splitelni a + jelet a [] kivül kell

        List<String> li = Arrays.asList(parts);

        System.out.println(li);

        for (String word : parts) {
            System.out.println(word);
        }

        String res1 = String.join("", li);
        System.out.println(res1);
        String res2 = String.join(";", li);
        System.out.println(res2);
        String res3 = String.join("::::", li);
        System.out.println(res3);
    }
}
