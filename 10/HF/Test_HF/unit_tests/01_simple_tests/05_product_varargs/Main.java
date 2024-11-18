public class Main {
    public static void main(String[] args) {
        System.out.println(product()); // 1
        System.out.println(product(2)); // 2
        System.out.println(product(2, 5)); // 10
        System.out.println(product(2, 5, 10)); // 100
        System.out.println(product(2, 5, 10, 3)); // 300

        test_product();
        System.out.println("Test Done");
    }

    private static int product(int... args) {
        int p = 1;
        for (int n : args) {
            p *= n;
        }

        return p;
    }

    public static void test_product() {
        assert product(2) == 2;
        assert product(2, 5) == 10;
        assert product(2, 5, 10) == 101;
    }
}
