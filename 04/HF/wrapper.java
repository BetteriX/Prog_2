public class wrapper {
    public static void main(String[] args) {
        System.out.println("Karakter metódusok: ");
        char s1 = 'j';
        char s2 = 'b';

        System.out.print("Kiirjuk az egyik karakter hosszát: ");
        System.out.println(Character.charCount(s1));

        System.out.print("Kiirjuk a két karakter közötti hosszát: ");
        System.out.println(Character.compare(s1, s2));

        System.out.println();

        System.out.println("Szám metódusok: ");
        int n1 = 2;
        int n2 = 5;

        System.out.print("Egy szám értékét: ");
        System.out.println(Integer.valueOf(n2));

        System.out.print("Két szám között kiválasza a legkisebbet: ");
        System.out.println(Integer.min(n1,n2));

        System.out.println();

        System.out.println("Double metódusok: ");
        double d1 = 3.78;
        String d2 = "5.5";

        System.out.print("Egy stringet átkonvertálja double-é");
        System.out.println(Double.parseDouble(d2));

        System.out.print("Ellenörizük hogy egy szám-e: ");
        System.out.println(Double.isNaN(d1));

        System.out.println();

        System.out.println("Boolean metódusok: ");
        boolean a = false;
        boolean b = true;

        System.out.print("Egy And operátort futatunk: ");
        System.out.println(Boolean.logicalAnd(a, b));
        
        System.out.print("Kiiratja a boolean értékét: ");
        System.out.println(Boolean.valueOf(b));
    }
}
