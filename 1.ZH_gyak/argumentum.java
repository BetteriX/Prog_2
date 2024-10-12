public class argumentum {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Hiba! Adj meg egy sztringet!");
            System.exit(1);
        }

        String szoveg = args[0];

        szoveg = StringUtils.swapCase(szoveg);

        System.out.println(szoveg);
    }
}
