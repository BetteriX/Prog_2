import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main2 {
    public static void main(String[] args) {
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

            PrintWriter writer = new PrintWriter("output.txt"); // "utf-8"
            writer.println("Hello world!");
            writer.print("9");
            writer.printf("9 + %d = %d\n", 9, 18);

            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
