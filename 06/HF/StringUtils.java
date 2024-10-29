public class StringUtils {
    private StringUtils() {

    }

    public static String randomCase(String word) {
        StringBuffer sb = new StringBuffer();

        for (char c : word.toCharArray()) {
            if (Math.random() < 0.5) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }
}
