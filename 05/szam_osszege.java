import java.util.Scanner;

public class szam_osszege {


        static String input(String prompt) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(prompt);

            String text = scanner.nextLine();

            return text;
        }

        public static void main(String[] args) {
            //int x = Integer.parseInt(input("First Number:"));
            //int y = Integer.parseInt(input("Second Number"));

            //int result = x + y;

            //System.out.println(result);

            //int arg_hossz = args.length;

            //if (arg_hossz < 2) {
            //    System.out.println("Nem adtál meg 2 számot! ");
            //    System.exit(1);
            // }

            //int x = Integer.parseInt(args[0]);
            //int y = Integer.parseInt(args[1]);

            //int result = x + y;

            char szam = '5';

            int sz = Character.getNumericValue(szam);

            //String name = PyUtil.input("Neved: ");
            //String no = PyUtil.input();

            StringBuilder a = new StringBuilder();
            a.append("hello");
            a.append(12);
            a.append('a');

            //System.out.println(a.toString());

            String s = "90146852";
            int osszeg = szamjegyekOsszege(s);

            System.out.println(osszeg);
        }

        public static int szamjegyekOsszege(String s) {
            int sum = 0;

            for (char e : s.toCharArray()) {
                sum += Character.getNumericValue(e);
            }
            
            return sum;
        }
}
