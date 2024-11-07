public class feladat3 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Nem adtál meg egyetlen szót sem!");
            System.exit(1);
        }

        for (String s : args) {
            for (char c : s.toCharArray()) {
                if (!Character.isLetter(c)) {
                    System.out.println("Szavakat kell megadni!");
                    System.exit(2);
                }
            }
        }

        // String[] rovid = new String[args.length / 2];

        for (int i = 0; i < args.length - 1; i++) {
            // int index = 0;
            // System.out.println(args[i].length() + " < " + args[i + 1].length());
            if (args[i].length() > args[i + 1].length()) {
                System.out.println(args[i + 1]);
                // rovid[index] = args[i];
                // index++;
            }

        }

        // System.out.println(rovid);

    }
}
