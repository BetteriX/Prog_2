import java.util.ArrayList;
import java.util.List;

class Listak1
{
    // A. match_ends
    // Bemenet: sztringek listája. Számoljuk meg, hogy a bemenetben
    // hány olyan sztring van, melynek a hossza legalább 2 s az
    // első karaktere egyezik az utolsó karakterével. A visszatérési
    // érték ezen feltételeket kielégítő sztringek száma legyen.
    private static int matchEnds(List<String> words)
    {
        int sum = 0;
        for (String szoveg : words) {
            int hossz = szoveg.length();

            
            if (hossz >= 2) {
                char szoveg_eleje = szoveg.substring(0).charAt(0);
                char szoveg_vege = szoveg.substring(hossz - 1).charAt(0);
                // Ha a karakterek egyeznek 0 as értéket add vissza
                if (Character.compare(szoveg_eleje, szoveg_vege) == 0) {
                    sum++;
                }
            }
        }

        return sum;
    }

    // B. front_x
    // Bemenet: sztringek listája. Egy olyan listával térjünk vissza,
    // melyben a szavak rendezve vannak, viszont az "x"-szel kezdődő szavak
    // kerüljenek előre.
    // Példa: ["mix", "xyz", "apple", "xanadu", "aardvark"] bemenet esetén
    // az eredmény: ["xanadu", "xyz", "aardvark", "apple", "mix"].
    // Tipp: használhatunk 2 listát is, melyeket külön-külön rendezünk, majd
    //       egyesítjük őket.
    private static List<String> frontX(List<String> words)
    {
        List<String> x_ek = new ArrayList<String>();
        List<String> x_nelkuli = new ArrayList<String>();

        for (String szoveg : words) {
            char szoveg_eleje = szoveg.substring(0).charAt(0);

            if (szoveg_eleje == 'x') {
                x_ek.add(szoveg);
            } else {
                x_nelkuli.add(szoveg);
            }
        }
        
        x_ek.sort(null);
        x_nelkuli.sort(null);

        List<String> result = new ArrayList<String>();
        result.addAll(x_ek);
        result.addAll(x_nelkuli);

        return result;
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(int got, int expected)
    {
        String prefix = (got == expected) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Egy egyszerű teszt fv. Kiírja az egyes fv.-ek visszaadott értékét, ill.
    // azt is, hogy mit kellett volna visszaadniuk.
    private static void test(List<String> got, List<String> expected)
    {
        var prefix = (got.equals(expected)) ? " OK " : "  X ";
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    // Ezt ne módosítsuk.
    // A main() fv. meghívja a fenti fv.-eket különféle paraméterekkel,
    // s a test() fv. segítségével megnézi, hogy az eredmények helyesek-e.
    public static void main(String[] args)
    {
        System.out.println("match_ends");
        test(matchEnds(List.of("aba", "xyz", "aa", "x", "bbb")), 3);
        test(matchEnds(List.of("", "x", "xy", "xyx", "xx")), 2);
        test(matchEnds(List.of("aaa", "be", "abc", "hello")), 1);

        System.out.println();
        System.out.println("front_x");
        test(frontX(List.of("bbb", "ccc", "axx", "xzz", "xaa")),
             List.of("xaa", "xzz", "axx", "bbb", "ccc"));
        test(frontX(List.of("ccc", "bbb", "aaa", "xcc", "xaa")),
             List.of("xaa", "xcc", "aaa", "bbb", "ccc"));
        test(frontX(List.of("mix", "xyz", "apple", "xanadu", "aardvark")),
             List.of("xanadu", "xyz", "aardvark", "apple", "mix"));
    }

}
