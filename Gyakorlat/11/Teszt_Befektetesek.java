import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Teszt_Befektetesek {
    public static void main(String[] args) {
        Set<Befektetes> halmaz = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(new File("befektetesek.txt")))) {
            String sor;
            int sor_count = 0;
            while ((sor = br.readLine()) != null) {
                String[] parts = sor.split(",");
                sor_count++;
                if (parts.length != 3) {
                    throw new HianyosAdatok("A" + sor_count + ". sor hiányos");
                }

                double toke = Double.parseDouble(parts[0]);
                int futamido = Integer.parseInt(parts[1]);
                double kamat = Double.parseDouble(parts[2]);

                // Fontos!
                halmaz.add(new Befektetes(toke, futamido, kamat));
            }catch(HianyosAdatok e){
                System.out.println(e.getMessage());
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
