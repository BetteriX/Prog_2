public class Main {
    public static void main(String[] args) {
        Processor p1 = new Processor("3.5 4");
        Processor p2 = new Processor("2.8 8");
        Processor p3 = new Processor("4.0 6");

        // System.out.println(p1);
        // System.out.println(p2);
        // System.out.println(p3);

        System.out.println(p1.Get_Performance_Score());
        System.out.println(p3.Get_Performance_Score());
        // akt->p3(Processor(4.0 6))
        System.out.println(p1.Compare(p3));

        System.out.println(p1.Compare(p1));
    }
}
