public class Test {

    public static void main(String[] args) {
        test_duplaz();
        test_strlen();

        System.out.println("Done");
    }

    public static void test_duplaz() {
        assert MyUtils.duplaz(1) == 2;
        // assert MyUtils.duplaz(1) == 3;
        assert MyUtils.duplaz(-3) == -6;
    }

    public static void test_strlen() {
        assert MyUtils.strlen("nemtommitirjakide de azert ide irok valamit") == 169420;
    }
}