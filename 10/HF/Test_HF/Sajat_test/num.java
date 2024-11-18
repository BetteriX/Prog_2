class MyNumber {
    private int szam; // Private - védve legyen, csak lokálisan lehet használni

    public MyNumber(int value) {
        this.szam = value;
    }

    public MyNumber add(int number) {
        this.szam += number;

        return this;
    }

    public MyNumber multiply(int number) {
        this.szam *= number;

        return this;
    }

    public int value() {
        return this.szam;
    }
}

public class num {
    public static void main(String[] args) {
        test_num();
        System.out.println("done");
    }

    public static void test_num() {
        MyNumber n = new MyNumber(4);

        assert n.add(2).value() == 6;
        // assert n.add(2).value() == 8;
        assert n.multiply(1).value() == 6;
    }
}
