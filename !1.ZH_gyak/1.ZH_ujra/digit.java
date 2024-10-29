public class digit {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error!");
            System.exit(1);
        }

        String szoveg = args[0];

        // if (szoveg.matches(".*\\d.*")) {
        // System.out.println("ez egy szám!");
        // }

        boolean ContainsDigit = false;
        for (char c : szoveg.toCharArray()) {
            // 0 és 9 határa között mozog
            if (c >= '0' && c <= '9') {
                ContainsDigit = true;
                break;
            }
        }

        if (ContainsDigit) {
            System.out.println("ez egy szám!");
            System.exit(1);
        }
    }
}
