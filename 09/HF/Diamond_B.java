import java.util.Scanner;

public class Diamond_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Magasság: ");

        int szam = scanner.nextInt();
        assert szam % 2 != 0 : "A magasság nem lehet páros!";
        int space = (szam / 2);
        int csillag = 1;

        for (int i = 0; i < szam / 2; i++) {
            Print_sor(space, csillag);
            space--;
            csillag += 2;
        }

        for (int i = 0; i < (szam / 2) + 1; i++) {
            Print_sor(space, csillag);
            space++;
            csillag -= 2;
        }
    }

    public static void Print_sor(int space, int csillag) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < csillag; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }
}
