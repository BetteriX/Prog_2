public class FizzBuzz {
    public int szam;

    public FizzBuzz(int szam) {
        this.szam = szam;
    }

    public void start() {
        for (int i = 1; i < szam; i++) {
            String fizzbuzz = "";
            if (i % 3 == 0) {
                fizzbuzz += "fizz";
            }

            if (i % 5 == 0) {
                fizzbuzz += "buzz";
            }

            if(fizzbuzz == "") {
                fizzbuzz += i;
            }

            System.out.println(fizzbuzz);
            fizzbuzz = "";
        }
    }
}
