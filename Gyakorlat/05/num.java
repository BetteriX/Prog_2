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
        MyNumber n = new MyNumber(5);

        n.add(2).multiply(3);

        System.out.println(n.value());
    }
}
