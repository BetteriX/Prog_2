import java.util.Scanner;

public class Math {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a negyzet hosszát: ");
        int negyzet_hossz = scanner.nextInt();

        Negyzet negyzet = new Negyzet(negyzet_hossz);
        int n_k = negyzet.kerulet();
        int n_t = negyzet.terulet();

        System.out.println("Negyzet kerulete: " + n_k);
        System.out.println("Negyzet terulete: " + n_t);

        System.out.print("Adja meg a kör sugarát: ");
        double kor_sugara = scanner.nextDouble();

        Circle circle = new Circle(kor_sugara);
        double c_k = circle.kerulet();
        double c_t = circle.terulet();

        System.out.println("Negyzet kerulete: " + c_k);
        System.out.println("Negyzet terulete: " + c_t);

        scanner.close();
    }
}
