import java.util.ArrayList;
import java.util.List;

public class tobbelemvisszadas {
    public static void main(String[] args) {
        // Tömb
        // int[] tomb = { 5, 6, 3, 9, 4, 2, 7, 99 };

        // min_max_tomb(tomb);

        // Lista
        // List<Integer> l = new ArrayList<Integer>();

        // l.add(5);
        // l.add(6);
        // l.add(3);
        // l.add(99);
        // l.add(2);

        // min_max_lista(l);

        // Objektum Lista
        List<Integer> obj_l = new ArrayList<Integer>(List.of(5, 6, 3, 99, 2));

        min_max_lista(obj_l);
    }

    public static void min_max_lista(List<Integer> l) {
        int min = l.get(0);
        int max = l.get(0);

        for (int num : l) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
    }

    public static void min_max_tomb(int[] tomb) {
        int hossz = tomb.length;

        int min = tomb[0];
        int max = tomb[0];
        for (int i = 1; i < hossz; i++) {
            if (tomb[i] < min) {
                min = tomb[i];
            }
            if (tomb[i] > max) {
                max = tomb[i];
            }
        }

        System.out.println("Max: " + max + " Min: " + min);
    }
}
