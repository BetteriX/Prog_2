public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Hiba! Kérem adjon meg egy pozitív egész számot parancssori argumentumként.");
            System.exit(1);
        }

        for (char c : args[0].toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Hiba! A háromszögszám számításához pozitív egész szám szükséges.");
                System.exit(2);
            }
        }

        int num = Integer.parseInt(args[0]);

        if (num < 0) {
            System.out.println("Hiba! A háromszögszám számításához pozitív egész szám szükséges");
            System.exit(2);
        }

        int result = MyMath.getNthTriangularNumber(num);

        System.out.println(String.format("A(z) %d. háromszögszám: %d", num, result));
    }
}