public class Stringfordit {
    public static void main(String[] args) {
        String s = "Java 21";

        // StringBuilder sb = new StringBuilder();
        // sb.append(s);

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        String result = sb.toString();
        System.out.println(result);

        String forditva = new StringBuilder(("Zsolt")).reverse().toString();
        System.out.println(forditva);
    }
}