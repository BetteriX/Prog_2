import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplikacio {

    public static void main(String[] args) {

        List<Integer> l = List.of(5, 2, 3, 5, 1, 4, -200, 5, 1, 3, 2, 2, 5);

        Set<Integer> sorted = new HashSet<>(l);

        List<Integer> result = new ArrayList<>(sorted);
        Collections.sort(result);

        System.out.println(result);

    }

}