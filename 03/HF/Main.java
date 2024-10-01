public class Main {
    public static void main(String[] args) {
        //Hamming h = new Hamming("toned", "rosess");
        //System.out.println("Hamming távolsága: " + h.Hamming_tavolsag());

        //FizzBuzz fb = new FizzBuzz(100);

        //fb.start();

        int diff = Hamming.distance("toned", "roses");

        System.out.println("Hamming-távolsága: " + diff);
    }    
}
