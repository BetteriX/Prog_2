import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String szereplo = args[0];
        List<Mese> mesek = new ArrayList<>();

        try (Scanner sc = new Scanner(new File("input.txt"))) {
            while (sc.hasNextLine()) {
                String sor = sc.nextLine();
                String[] reszek = sor.split(":");

                String cim = reszek[0];
                List<String> szereplok = Arrays.asList(reszek[1].split(","));

                mesek.add(new Mese(cim, szereplok));
            }

            sc.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<Mese> talalatok = new ArrayList<>();

        for (Mese e : mesek) {
            if (e.get_szereplok().contains(szereplo)) {
                talalatok.add(e);
            }
        }

        // compareTo miatt
        Collections.sort(talalatok);

        for (Mese m : talalatok) {
            System.out.println(m);
        }

        // File-ba iratás
        try (PrintWriter pw = new PrintWriter(new File("output.txt"))) {
            for (Mese m : talalatok) {
                pw.printf("%s\n", m); // vagy m.toString()
            }

            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
