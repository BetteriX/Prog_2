import java.util.List;

public class Test {
    public static void main(String[] args) {
        test_range();

        System.out.println("Done");
    }

    public static void test_range() {
        assert PyUtils.range(0, 10, 1).equals(List.of(0, 2, 4, 6, 8));
        assert PyUtils.range(0, 10).equals(List.of(0, 2, 4, 6, 8));
        assert PyUtils.range(10).equals(List.of(1, 2, 4, 6, 8));
    }
}