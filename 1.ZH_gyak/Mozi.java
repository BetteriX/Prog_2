import java.util.List;

public class Mozi {
    public static void main(String[] args) {
        String fname = "mozik.csv";

        List<String> sorok = FileUtils.readLines(fname);

        int sum_felmillio = 0;
        for (String sor : sorok) {
            String[] adatok = sor.split(";");

            float ertekeles = Float.parseFloat(adatok[0].replace(",", "."));
            String cim = adatok[1];
            int szavazat = Integer.parseInt(adatok[2]);

            if (szavazat >= 500_000) {
                System.out.println(cim);
                sum_felmillio++;
            }
        }
        System.out.println("Legalább félmillióan szavozott filmek száma: " + sum_felmillio);
    }
}
