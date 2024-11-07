import java.util.List;

public class feladat2 {

    public static void main(String[] args) {

        List<String> sorok = FileUtils.readLines("szavak.txt");

        int count = 0;

        for (String sor : sorok) {

            count += sor.trim().length(); // -> \n vagy " "
        }

        System.out.println("A betűk összege: " + count);

    }

}
