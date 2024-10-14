import java.util.ArrayList;
import java.util.List;

public class Main {
    public class Verem {
        private List<Integer> szamok = new ArrayList<>();

        public int size() {
            return this.szamok.size();
        }

        public boolean isEmpty() {
            return this.szamok.isEmpty();
        }

        public void append(int szam) {
            this.szamok.add(szam);
        }

        public int pop() {
            return this.szamok.remove(this.szamok.size() - 1);
        }

        public String toString() {
            return this.szamok.toString().replace("]", "");
        }
    }

    public static void main(String[] args) {
        // String s = "";
        // for (int i = 1; i <= 20; i++) {
        // s += "" + i;
        // s += String.valueOf(i);
        // }

        // System.out.println(s);

        // v2
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 20; i++) {
            sb.append(i);
        }

        String result = sb.toString();
        System.out.println(result);
    }
}