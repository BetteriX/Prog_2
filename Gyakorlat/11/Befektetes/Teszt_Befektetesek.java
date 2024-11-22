import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Teszt_Befektetesek {
    public static void main(String[] args) {
        Set<Befektetes> halmaz = new HashSet<>(); // Duplikációkat nem tartalmaz (d.)
        // List<Befektetes> halmaz = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(new File("befektetesek.txt")))) {
            String sor;
            int sor_count = 0;
            while ((sor = br.readLine()) != null) {
                String[] parts = sor.split(",");
                sor_count++;
                if (parts.length != 3) {
                    // Hogyha nincsen meg az öszess adat akkor eldobja és nem rakja belle. (d.)
                    throw new HianyosAdatok("A" + sor_count + ". sor hiányos");
                }

                double toke = Double.parseDouble(parts[0]);
                int futamido = Integer.parseInt(parts[1]);
                double kamat = Double.parseDouble(parts[2]);

                // Fontos!
                halmaz.add(new Befektetes(toke, futamido, kamat));
            }

        } catch (HianyosAdatok e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Csak listával tudjuk megvalosítani a compareTo()-val (d.)
        // Így végül sorba tettük és nem tartalmaz duplikációkat sem!
        List<Befektetes> sorted_l = new ArrayList<>(halmaz);

        Collections.sort(sorted_l);

        try (PrintWriter pw = new PrintWriter(new File("veglegesitett_befektetesek.txt"))) {
            for (Befektetes s : sorted_l) {
                pw.printf("%s\n", s);
            }

            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
