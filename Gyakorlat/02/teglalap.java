import java.util.Scanner;

class Teglalap_Adatok{
    public int a;
    public int b;

    public Teglalap_Adatok(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getKerulet(){
        return 2 * (a + b);
    }

    public int GetTerulet(){
        return a * b;
    }
}

public class teglalap {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adja meg a téglalap oldalát: ");
        int a = scanner.nextInt();

        System.out.print("Adja meg a téglalap hosszát: ");
        int b = scanner.nextInt();

        Teglalap_Adatok t_adatok = new Teglalap_Adatok(a, b);

        System.out.println("Kerulete: " + t_adatok.getKerulet());
        System.out.println("Terulete " + t_adatok.GetTerulet());

        scanner.close();
    }    
    /* 
    static int getKerulet(int a, int b){
        return 2 * (a + b);
    }
    */
}
