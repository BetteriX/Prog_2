public class string_tisztitas {
    public static void main(String[] args) {
        String szoveg = "192.20.246.138:\n\t 6666";
        
        String tisztott_szoveg = szoveg.replaceAll("\\s", "");

        System.out.println(tisztott_szoveg);
    }
}
