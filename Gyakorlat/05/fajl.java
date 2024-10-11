import java.util.List;

public class fajl {
    public static void main(String[] args) {
        String fname = "szoveg.txt";

        List<String> sorok = FileUtils.readLines(fname);

        for (String sor : sorok) {
            System.out.println("#" + sor + "#");
        }

        System.out.println(sorok);
    }
}
