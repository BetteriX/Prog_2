public class TestMain {
    public static void main(String[] args) {
        test_duplaz();
        System.out.println("done");
    }

    private static void test_duplaz() {
        assert Main.duplaz(0) == 0;
        // assert Main.duplaz(1) == 2i ;
        assert Main.duplaz(1) == 3;
        assert Main.duplaz(-3) == -6;
    }
}
