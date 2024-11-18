public class Test {
    public static void main(String[] args) {
        test_verem();

        System.out.println("Done");
    }

    public static void test_verem() {
        Verem v = new Verem();
        assert v.isEmpty() == true;
        v.append(1);
        v.append(2);
        assert v.size() == 2;
        assert v.pop() == 2;
        assert v.toString().equals("Java egy szar!");
    }
}
