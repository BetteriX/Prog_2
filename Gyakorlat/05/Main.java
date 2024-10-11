public class Main {
    class Verem {
        public int data;

        public void betesz(int value) {
            this.data.add(value);
        }

        @Override
        public String toString() {
            String result = this.data.toString();
            result = result.replace("]", "");
            return result;
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