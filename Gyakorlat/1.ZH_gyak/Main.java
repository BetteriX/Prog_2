import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fname = "mozik.csv";

        List<String> sorok = FileUtils.readLines(fname);

        for (String sor : sorok) {
            String[] adatok = sor.split(";");

            double ertekeles = Double.parseDouble(adatok[0]);
            String cim = adatok[1];
            int szavazat = Integer.parseInt(adatok[2]);

            System.out.println();
        }
    }
}
