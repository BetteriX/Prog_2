import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Your name: ");
        //String name = scanner.nextLine();
        //System.out.println("Hello " + name);

        System.out.print("Első szám: ");
        int number_1 = scanner.nextInt();

        System.out.print("Második szám: ");
        int number_2 = scanner.nextInt();

        int final_number = number_1 + number_2;

        System.out.printf("%d + %d = %d\n",number_1, number_2, final_number);

        scanner.close();
    }
}
