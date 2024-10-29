import java.util.List;

public class eros_jelszo {
    public static void main(String[] args) {
        String fname = "passwords.txt";

        List<String> sorok = FileUtils.readLines(fname);

        int sum_eros_jelszok = 0;
        for (String sor : sorok) {
            if (StringUtils.strongPassword(sor)) {
                sum_eros_jelszok++;
            }
        }

        System.out.println("Az erős jelszok száma: " + sum_eros_jelszok);
    }
}
