public class kor {
    public static void main(String[] args) {
        double r = 2.5;

        double ter = terulet(r);

        System.out.printf("A kor terulete: %.2f\n", ter);
    }

    static double terulet(double r) {
        return r * r * Math.PI;
    }
}
