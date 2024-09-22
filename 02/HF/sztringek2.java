public class sztringek2
{
    // E. verbing
    // Ha az adott sztring hossza legalább 3, akkor
    // a végéhez adjuk hozzá az 'ing' ragot.
    // Ha 'ing'-re végződik, akkor ehelyett az 'ly'
    // ragot tegyük hozzá.
    // Ha a sztring hossza rövidebb 3 karakternél, akkor
    // hagyjuk változatlanul.
    // Adjuk vissza az eredménysztringet.
    private static String verbing(String s)
    {
        int s_hossz = s.length();
        if(s_hossz >= 3){
            if(s.endsWith("ing")){
                s = s + "ly";
            }
            else{
                s = s + "ing";
            }
        }

        return s;
    }

    // F. not_bad
    // Egy adott sztringben keressük meg a 'not' és
    // 'bad' szavak előfordulási helyét. Ha a 'bad'
    // a 'not' szót követi, akkor cseréljük ki az
    // egész 'not'...'bad' részsztringet a 'good' szóra.
    // Adjuk vissza az eredmény sztringet.
    // Példa: 'This dinner is not that bad!' ->
    //        This dinner is good!
    private static String notBad(String s)
    {
        if(s.contains("not so bad")){
            s = s.replace("not so bad", "good");
        }
        else{
            s = s.replace("not that bad", "good");
        }

        return s;
    }

    // G. front_back
    // Egy sztringet osszunk két részre, s a két részt nevezzük
    // a sztring elejének és végének. Ha a sztring hossza páros, akkor
    // a két rész hossza azonos. Ha a hossz páratlan, akkor az eleje
    // legyen egy karakterrel hosszabb mint a vége.
    // Például 'abcde' esetén a két rész: 'abc' és 'de'.
    // Két adott sztring (a és b) esetén adjunk vissza egy sztringet, mely
    // a következőképpen épül fel:
    // a-eleje + b-eleje + a-vége + b-vége
    // Például ha a = 'abcd' és b = 'xy', akkor az eredmény 'abxcdy' legyen.
    private static String frontBack(String a, String b)
    {
        int a_hossz = a.length();
        int b_hossz = b.length();
        
        // Az a felezése
        int a_fele = a_hossz / 2;
        String a_eleje = "";
        String a_vege = "";
        if(a_hossz % 2 == 0){
            a_eleje = a.substring(0, a_fele);
            a_vege = a.substring(a_fele,a_hossz);
            //System.out.println("a paros: "+ a_eleje + " " + a_vege);
        }
        else{
            a_eleje = a.substring(0, a_fele+1);
            a_vege = a.substring(a_fele+1, a_hossz);
            //System.out.println("a paratlan: "+ a_eleje + " " + a_vege);
        }

        
        // A b felezése
        int b_fele = b_hossz / 2;
        String b_eleje = "";
        String b_vege = "";
        if(b_hossz % 2 == 0){
            b_eleje = b.substring(0, b_fele);
            b_vege = b.substring(b_fele,b_hossz);
            //System.out.println("b paros: " + b_eleje + " " + b_vege);
        }
        else{
            b_eleje = b.substring(0, b_fele+1);
            b_vege = b.substring(b_fele+1, b_hossz);
            //System.out.println("b paratlan: " + b_eleje + " " + b_vege);
        }

        String result = a_eleje + b_eleje + a_vege + b_vege;

        return result;
    }

    static void test(String got, String expected)
    {
        String prefix = (got.equals(expected) ? " OK " : "  X ");
        System.out.printf("%s got: %s; expected: %s\n", prefix, got, expected);
    }

    public static void main(String[] args)
    {
        System.out.println("verbing");
        test(verbing("hail"), "hailing");
        test(verbing("swiming"), "swimingly");
        test(verbing("do"), "do");

        System.out.println();
        System.out.println("not_bad");
        test(notBad("This movie is not so bad"), "This movie is good");
        test(notBad("This dinner is not that bad!"), "This dinner is good!");
        test(notBad("This tea is not hot"), "This tea is not hot");
        test(notBad("It's bad yet not"), "It's bad yet not");

        System.out.println();
        System.out.println("front_back");
        test(frontBack("abcd", "xy"), "abxcdy");
        test(frontBack("abcde", "xyz"), "abcxydez");
        test(frontBack("Kitten", "Donut"), "KitDontenut");
    }
}
