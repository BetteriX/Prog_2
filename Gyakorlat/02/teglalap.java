import java.util.Scanner;

public class teglalap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a téglalap oldalát: ");
        int a = scanner.nextInt();

        System.out.print("Adja meg a téglalap hosszát: ");
        int b = scanner.nextInt();


        int kerulet = getKerulet(a, b);

        System.out.println(kerulet);

        scanner.close();
    }    

    static int getKerulet(int a, int b){
        return 2 * (a + b);
    }
}
