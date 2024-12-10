using static System.Console;
using System;
using System.Text;

namespace Program
{
    class Sztringek1
    {
        // A. donuts
        // Bemenet: egy egész szám (a fánkok száma).
        // Adjunk vissza egy sztringet a köv. formában: 'Fánkok száma: <count>',
        // ahol <count> a bemenetként kapott érték.
        // Viszont ha a fánkok száma 10 vagy több, akkor a tényleges szám helyett
        // a 'sok' szót használjuk.
        // Vagyis donuts(5) visszatérési értéke 'Fánkok száma: 5', míg
        // donuts(23) visszatérési értéke 'Fánkok száma: sok'
        private static string Donuts(int n)
        {
            if (n >= 10)
            {
                return "Fánkok száma: sok";
            }
            return "Fánkok száma: " + n;
        }

        // B. both_ends
        // Egy adott s sztring esetén adjunk vissza egy olyan sztringet,
        // mely az eredeti sztring első 2 és utolsó 2 karakteréből áll.
        // Vagyis 'spring' esetén a visszatérési érték 'spng'.
        // Ha az input sztring hossza 2-nél rövidebb, akkor egy üres
        // sztringet adjunk vissza.
        private static string BothEnds(string s)
        {
            if (s.Length < 2)
            {
                return "";
            }
            String elso_ketto = s.Substring(0,2);
            String utolso_ketto = s.Substring(s.Length - 2);
            return elso_ketto + utolso_ketto;
        }

        // C. fix_start
        // Egy adott s sztring esetén adjunk vissza egy olyan sztringet,
        // melyben az első karakter összes előfordulása helyén egy '*'
        // szerepel, kivéve a legelső pozíciót.
        // Példa: 'babble' => 'ba**le'
        // Feltételezhetjük, hogy a bemeneti sztring hossza legalább 1.
        // Tipp: s.replace(stra, strb) egy olyan sztringet ad vissza,
        // melyben az stra összes előfordulása ki van cserélve strb-re.
        private static string FixStart(string s)
        {
            Char elso_betu = s[0];
            
            String utolso_ketto = s.Substring(1);
            return elso_betu + utolso_ketto.Replace(elso_betu, '*');
        }

        // D. MixUp
        // Adott két bemeneti sztring, a és b. Adjunk vissza egyetlen sztringet,
        // melyben a és b konkatenálva van úgy, hogy köztük egyetlen szóköz szerepel.
        // Ezen túl cseréljük fel a két sztring első két karakterét az eredményben.
        // Példa:
        //   'mix', 'pod' -> 'pox mid'
        //   'dog', 'dinner' -> 'dig donner'
        // Feltételezhetjük, hogy a bemeneti sztringek hossza legalább 2.
        private static string MixUp(string a, string b)
        {
            String elso_ketto_a = a.Substring(0, 2);
            String elso_ketto_b = b.Substring(0, 2);
            
            String result_a = elso_ketto_b + a.Substring(2);
            String result_b = elso_ketto_a + b.Substring(2);
            
            return result_a + " " + result_b;
        }

        private static void Test(string got, string expected)
        {
            var prefix = (got == expected ? " OK " : "  X ");
            WriteLine($"{prefix} got: {got}; expected: {expected}");
        }

        public static void Main(string[] args)
        {
            Test(Donuts(4), "Fánkok száma: 4");
            Test(Donuts(9), "Fánkok száma: 9");
            Test(Donuts(10), "Fánkok száma: sok");
            Test(Donuts(99), "Fánkok száma: sok");
            WriteLine("#");
            Test(BothEnds("spring"), "spng");
            Test(BothEnds("Hello"), "Helo");
            Test(BothEnds("a"), "");
            Test(BothEnds("xyz"), "xyyz");
            WriteLine("#");
            Test(FixStart("babble"), "ba**le");
            Test(FixStart("aardvark"), "a*rdv*rk");
            Test(FixStart("google"), "goo*le");
            Test(FixStart("donut"), "donut");
            WriteLine("#");
            Test(MixUp("mix", "pod"), "pox mid");
            Test(MixUp("dog", "dinner"), "dig donner");
            Test(MixUp("gnash", "sport"), "spash gnort");
            Test(MixUp("pezzy", "firm"), "fizzy perm");
        }
    }
}