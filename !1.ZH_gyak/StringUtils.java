public class StringUtils {
    private StringUtils() {
        // Nincs példányosítva
    }

    public static String swapCase(String szoveg) {
        StringBuffer sb = new StringBuffer();

        for (char c : szoveg.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();

        // int hossz = szoveg.length();
        // char[] char_szoveg = szoveg.toCharArray();

        // Ezt iterációs for-al nem érdemes megcsinálni mert itt az i változó kell hogy
        // tudjunk hivatkozni a következő betüre
        // for (int i = 0; i < hossz; i++) {
        // if (Character.isUpperCase(char_szoveg[i])) {
        // char_szoveg[i] = Character.toLowerCase(char_szoveg[i]);
        // } else if (Character.isLowerCase(char_szoveg[i])) {
        // char_szoveg[i] = Character.toUpperCase(char_szoveg[i]);
        // }
        // }

        // Átkonvertájuk string-é
        // return new String(char_szoveg);
    }

    public static boolean strongPassword(String password) {
        int kis_betu = 0;
        int nagy_betu = 0;
        int szam = 0;
        char[] spec_karakterek = { '.', ',', ':', ';' };
        int spec_karakter = 0;

        for (char c : password.toCharArray()) {
            if (kis_betu < 1 && Character.isLowerCase(c)) {
                kis_betu++;
            } else if (nagy_betu < 1 && Character.isUpperCase(c)) {
                nagy_betu++;
            } else if (szam < 2 && Character.isDigit(c)) {
                szam++;
            } else if (spec_karakter < 1) {
                for (int i = 0; i < 4; i++) {
                    if (c == spec_karakterek[i]) {
                        spec_karakter++;
                        continue;
                    }
                }
            }

            if (kis_betu == 1 && nagy_betu == 1 && szam == 2 && spec_karakter == 1) {
                return true;
            }
        }

        /*
         * int hossz = password.length();
         * char[] password_char = password.toCharArray();
         * for (int i = 0; i < hossz; i++) {
         * 
         * if (kis_betu < 1) {
         * if (Character.isLowerCase(password_char[i])) {
         * kis_betu++;
         * // Ha kisbetu akkor visszaugrik a ciklus elejére ezzel gyorsitva hogy
         * felesleges
         * // köröket ne fusson
         * continue;
         * }
         * }
         * 
         * if (nagy_betu < 1) {
         * if (Character.isUpperCase(password_char[i])) {
         * nagy_betu++;
         * continue;
         * }
         * }
         * 
         * if (szam < 2) {
         * if (Character.isDigit(password_char[i])) {
         * szam++;
         * continue;
         * }
         * }
         * 
         * if (spec_karakter < 1) {
         * // Végig megy a 4 speciális karakteren hogy benne van-e
         * for (char c : spec_karakterek) {
         * if (password_char[i] == c) {
         * spec_karakter++;
         * continue;
         * }
         * }
         * }
         * 
         * 
         * if (kis_betu == 1 && nagy_betu == 1 && szam == 2 && spec_karakter == 1) {
         * return true;
         * }
         * }
         */

        return false;
    }
}
