import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Lift> l = new ArrayList<>();

        try (Formatter fr = new Formatter(new File(args[1])); Scanner sc = new Scanner(new File(args[0]))) {
            int lift_szam = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < lift_szam; i++) {
                try {
                    l.add(new Lift(Integer.parseInt(sc.nextLine())));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    l.add(new Lift(10));
                }
            }

            while (sc.hasNextLine()) {
                String sor = sc.nextLine();

                String[] tmp = sor.split(";");
                try {
                    int idx = Integer.parseInt(tmp[0]) - 1;

                    if (tmp[1].equals("fel")) {
                        l.get(idx).felfele();
                    } else {
                        l.get(idx).lefele();
                    }

                    System.out.println(l.get(idx));
                    fr.format("A lift: %s Aktualis emelet: %d\n", l.get(idx).toString(),
                            l.get(idx).Get_aktualis_emelet());

                } catch (NumberFormatException e) {
                    System.out.println("Hibas sor!");
                }
            }
        } catch (HibasIranyException e) {
            System.out.println(e.getMessage() + " " + e.getHibakod());
        } catch (Exception e) { // A végére mindig kell rakni
            System.out.println(e.getMessage());
        }
    }
}
