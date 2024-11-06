import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sorok = FileUtils.readLines("szavak.txt");

        // Akkor rímel a szó ha az utolsó 3 betű megegyezik egymással
        int i = 0;
        while (i < sorok.size()) {
            String elso_szo = sorok.get(i);
            String elso_utolso_harom = elso_szo.substring(elso_szo.length() - 3);

            int j = i + 1; // Azért adunk hozzá 1 et hogy önmagával ne legyen egyenlő
            while (j < sorok.size()) {
                String masodik_szo = sorok.get(j);
                String masodik_utolso_harom = masodik_szo.substring(masodik_szo.length() - 3);

                if (elso_utolso_harom.equals(masodik_utolso_harom)) {
                    System.out.println(elso_szo + " - " + masodik_szo);
                    System.exit(0);
                }

                j++;
            }
            i++;
        }
    }
}
