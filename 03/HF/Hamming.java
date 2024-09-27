public class Hamming {
    public String karakter_sorozat_1;
    public String karakter_sorozat_2;
    

    public Hamming(String karakter_sorozat_1, String karakter_sorozat_2) {
        this.karakter_sorozat_1 = karakter_sorozat_1;
        this.karakter_sorozat_2 = karakter_sorozat_2;
    }
    
    public int Hamming_tavolsag() {
        int ks_1_hossz = karakter_sorozat_1.length();
        int ks_2_hossz = karakter_sorozat_2.length();

        if (ks_1_hossz != ks_2_hossz) {
            return -1;
        }
        else {
            char[] ks_1_charArray = karakter_sorozat_1.toCharArray();
            char[] ks_2_charArray = karakter_sorozat_2.toCharArray();

            int tavolsag_sum = 0;
            for (int i = 0; i < ks_1_hossz; i++) {
                if (ks_1_charArray[i] == ks_2_charArray[i]) {
                    tavolsag_sum++;
                }
            }

            return tavolsag_sum;
        }
    }
}
