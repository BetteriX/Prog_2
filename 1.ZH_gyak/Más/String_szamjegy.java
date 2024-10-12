public class String_szamjegy {
    public static void main(String[] args) {
        String s = "90146852";

        char[] s_char = s.toCharArray();
        int sum = 0;
        for (char c : s_char) {
            // int szam = Character.getNumericValue(c);
            int szam = c - '0';
            sum += szam;
        }

        System.out.println(sum);
    }
}
