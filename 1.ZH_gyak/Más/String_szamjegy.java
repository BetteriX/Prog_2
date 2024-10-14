// Egy karaktert eltoltunk 2-vel
//
//int szam = ((int) c) + 2;
//char newChar = (char) szam;

//System.out.println(newChar);

public class String_szamjegy {
    public static void main(String[] args) {
        String s = "90146852";

        char[] s_char = s.toCharArray();
        int sum = 0;
        for (char c : s_char) {
            // int szam = Character.getNumericValue(c); // Átalakitja char-t int-é
            int szam = c - '0'; // Szintén csak egyszerűbb
            sum += szam;
        }

        System.out.println(sum);
    }
}
