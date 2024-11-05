public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("World");
        sb.append(2024);

        System.out.println(sb.toString());
    }
}