public class SztringBuff {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer();

        // for (int i = 1; i <= 20; i++) {
        // sb.append(i);
        // }

        // System.out.println(sb.toString().length());
        // System.out.println(sb.reverse().toString());

        // System.out.println(strrev("Nem tom"));

        if (isPalindrom("lehel")) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Nem palindrom");
        }

        System.out.println(swapCase("JaNóMelleg24"));
    }

    static String strrev(String s) {
        StringBuffer sb = new StringBuffer(s);

        return sb.reverse().toString();
    }

    static boolean isPalindrom(String s) {
        StringBuffer sb = new StringBuffer(s).reverse();

        // Debug
        // System.out.println(sb.toString());

        // Ezzel a megoldással nem fog münködni!
        // if (s == sb.toString()) {
        // return true;
        // }

        // Ezzel már fog
        if (s.equals(sb.toString())) {
            return true;
        }

        return false;
    }

    static String swapCase(String s) {
        StringBuffer sb = new StringBuffer();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
