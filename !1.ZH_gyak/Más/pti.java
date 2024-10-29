import java.util.ArrayList;
import java.util.List;

public class pti {
    public static void main(String[] args) {
        String fname = "nevek.csv";
        List<String> sorok = FileUtils.readLines(fname);

        List<String> pti_nevek = new ArrayList<String>();
        for (String sor : sorok) {
            String[] adatok = sor.split(",");

            String nev = adatok[0];
            int kor = Integer.parseInt(adatok[1]);
            String szak = adatok[2].toLowerCase();

            if (szak.equals("pti")) {
                String nev_cap = nev.toUpperCase().charAt(0) + nev.substring(1);
                pti_nevek.add(nev_cap);
            }

        }

        pti_nevek.sort(null);

        for (int i = 0; i < pti_nevek.size(); i++) {
            System.out.print(pti_nevek.get(i));

            if (i != pti_nevek.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
