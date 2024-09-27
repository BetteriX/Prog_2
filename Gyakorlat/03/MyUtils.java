public class MyUtils {
    public static int duplaz(int a) {
        return a * 2;
    }

    public static int strlen(String szoveg) {
        return szoveg.length();
    }

    public static void reverse(int[] szam) {
        int j = szam.length - 1;
        int i = 0;

        //int[] reversed_szam = new int[szam_hossz];
        //int index = 0;
        //for (int i = szam_hossz - 1; i >= 0; i--) {
        //    reversed_szam[index] = szam[i];
        //    index++;
        //}

        while (i < j) {
            int tmp = szam[i];
            szam[i] = szam[j];
            szam[j] = tmp;

            i++;
            j--;
        }
    }
}
