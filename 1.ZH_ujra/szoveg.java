import java.util.List;

public class szoveg {

    public static void main(String[] args) {

        List<String> szoveg = FileUtils.readLines("alphanumeric_matrix.txt");
        int kint = 0;

        for (String s : szoveg) {

            char[] c = s.toCharArray();

            int start = 0;
            int end = 0;

            for (int i = 0; i < c.length; i++) {

                if (Character.isDigit(c[i])) {
                    start = i;
                    break;
                }

            }

            for (int i = c.length - 1; i >= 0; i--) {

                if (Character.isDigit(c[i])) {
                    end = i;
                    break;
                }

            }

            StringBuilder stringecske = new StringBuilder();
            stringecske.append(c[start]);
            stringecske.append(c[end]);

            kint += Integer.parseInt(stringecske.toString());
        }

        System.out.println("A számok összege: " + kint);

    }

}
