import java.util.HashMap;



public class Csodalalatos_elme {

    public static void main(String[] args) {
        String TEXT = """
                3Z 4Z UZ3N37 4Z7 4 C3L7 5Z0LG4LJ4, H0GY B3B1Z0NY1754
                M1LY3N C50D4L4705 D0LG0KR4 K3P35 4Z 3LM3.
                3LK3P35Z70 D0LG0KR4! N3H3Z V0L7 3L05Z0R 3L0LV45N0D
                3Z7, D3 M1R3 1D33R5Z 3HH3Z 4 50RH0Z, 4Z 3LM3D
                4U70M471KU54N 3L 7UDJ4 0LV45N1.
                4N3LKUL H0GY G0ND0LK0DN0D K3LL3N3 R4J74.
                L3GY BU5ZK3! C54K K3V35 3MB3R K3P35 3L0LV45N1 3Z7.
                H4 7375Z377, 05ZD M3G M450KK4L 15!
                """;

        // Létrehezunk egy HashMapet ami egy karaktert fog egy másik karakteré átforditani
        HashMap<Character, Character> charmap = new HashMap<>() {{
            put('3', 'E');
            put('4', 'A');
            put('5', 'S');
            put('0', 'O');
            put('1', 'I');
            put('7', 'T');
            }
        };
        
        char[] charArray_TEXT = TEXT.toCharArray();


        for (int i = 0; i < charArray_TEXT.length; i++) {
            // Ha megtalál egy betüt akkor leforditja a value-ra
            if (charmap.containsKey(charArray_TEXT[i])) {
                // Behelytesítjük
                charArray_TEXT[i] = charmap.get(charArray_TEXT[i]);
            }
        }

        // A charArray-t átalakitjuk String-é
        String decoded_TEXT = new String(charArray_TEXT);
        System.out.println(decoded_TEXT);
    }
}