public class tipuskonverziok {
    public static void main(String[] args) {
        test_type();
        System.out.println("done");
    }

    public static void test_type() {
        long x1 = Long.parseLong("123");
        float x2 = Float.parseFloat("3.14");
        double x3 = Double.parseDouble("7.89");
        char x4 = "a".charAt(0);

        assert x1 == 123;
        // assert x1 == 123.00;
        assert x2 == 3.14;
        assert x3 == 7.89;
        assert x4 == 'a';
    }
}