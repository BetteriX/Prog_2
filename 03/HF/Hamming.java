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
            if (ks_1_hossz % 2 == 0) {
                return ks_1_hossz / 2;
            }
            else {
                return (ks_1_hossz / 2) + 1;
            }
        }
    }
}
