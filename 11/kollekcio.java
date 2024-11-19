import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class kollekcio {
    public static void main(String[] args) {
        // Halmaz
        Set<String> uniqueFruits1 = new HashSet<>();
        uniqueFruits1.add("Apple");
        uniqueFruits1.add("Banana");
        uniqueFruits1.add("Orange");

        uniqueFruits1.add("Apple");
        System.out.println("Set: " + uniqueFruits1);

        Set<String> uniqueFruits2 = new HashSet<>(Arrays.asList("Banana", "Grapes", "Orange"));

        System.out.println("Set2: " + uniqueFruits2);

        Set<String> unio = new HashSet<>(uniqueFruits1);
        unio.addAll(uniqueFruits2);
        System.out.println("Unio: " + unio);

        Set<String> intersection = new HashSet<>(uniqueFruits1);
        intersection.retainAll(uniqueFruits2);
        System.out.println("Intersection: " + intersection);

        Set<String> difference = new HashSet<>(uniqueFruits1);
        difference.removeAll(uniqueFruits2);
        System.out.println("Difference: " + difference);

        // Map
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 80);
        fruitPrices.put("Orange", 90);

        System.out.println("Map " + fruitPrices);
        System.out.println("Price of Apple: " + fruitPrices.get("Apple"));
        System.out.println("Map contains Banana " + fruitPrices.containsKey("Banana"));
        fruitPrices.remove("Orange");
    }
}
