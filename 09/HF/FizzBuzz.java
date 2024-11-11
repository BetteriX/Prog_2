public class FizzBuzz {
    private int szam;

    public FizzBuzz(int szam) {
        this.szam = szam;
    }

    public void start() {
        for (int i = 1; i <= szam; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) {
                sb.append("fizz");
            }

            if (i % 5 == 0) {
                sb.append("buzz");
            }

            if (sb.toString().equals("")) {
                sb.append(Integer.toString(i));
            }

            System.out.println(sb.toString());
        }
    }
}
