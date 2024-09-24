public class Main {
    public static void main(String[] args) {
        System.out.println(Movie.count);

        Movie m1 = new Movie("Terminator",1984,7.6);
        Movie m2 = new Movie("Star Wars",1980,8.7);
        
        System.out.println(Movie.count);

        System.out.println(m2);
    }
}
