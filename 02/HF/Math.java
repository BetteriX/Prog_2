import java.util.Scanner;

public class Math {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /* 
        System.out.print("Adja meg a negyzet hosszát: ");
        int negyzet_hossz = scanner.nextInt();

        Negyzet negyzet = new Negyzet(negyzet_hossz);
        int n_k = negyzet.kerulet();
        int n_t = negyzet.terulet();

        System.out.println("Negyzet kerulete: " + n_k);
        System.out.println("Negyzet terulete: " + n_t);
        */

        System.out.print("Adja meg a kör sugarát: ");
        double kor_sugara = scanner.nextDouble();

        Circle circle = new Circle(kor_sugara);
        double c_k = circle.kerulet();
        double c_t = circle.terulet();

        System.out.println("Kör kerulete: " + c_k);
        System.out.println("Kör terulete: " + c_t);

        Circle c1 = new Circle((5.54));
        Circle c2 = new Circle((5));
        Circle c3 = new Circle((10));

        if(c1.isSmamallerThan(c2))
            System.out.println("smaller");
        else
            System.out.println("not smaller");

        scanner.close();
    }
}
