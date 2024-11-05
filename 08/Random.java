public class Random {
    public static void main(String[] args) {
        System.out.println(Math.random()); // [0.0, 1.0] -> Double
        System.out.println(Math.random() * 100); // [0.0, 100.0] -> Double
        System.out.println((int) (Math.random() * 100)); // [0, 100] -> Integer (A zárójel jel nagyon fontos! Mert akkor
                                                         // 0-t adna vissza mindig)

    }
}
