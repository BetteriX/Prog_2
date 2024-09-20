import java.util.Scanner;


public class StringExample {
    public static void main(String[] args){
        //String s1 = new String("Hello");
        //String s2 = "World";

        String superhero = "batman";

        //System.out.println(superhero.substring(1));

        //System.out.println(superhero.substring(1,4));

        //System.out.println(superhero.substring(3));

        String videoGame = "Fallout: New Vegas";

        // out
        System.out.println(videoGame.substring(4,7));
        // vegas
        System.out.println(videoGame.substring(13));

        System.out.println(superhero.toUpperCase().substring(0,3));


        String language = "Java , C, C++, C#, python";
        
        System.out.println(language.length());
        System.out.println(language.toUpperCase());
        System.out.println(language);
        System.out.println(language.toLowerCase());

        System.out.println(language.indexOf('a'));
        System.out.println(language.indexOf("va"));
        System.out.println(language.indexOf('x'));

        System.out.println(language.trim());
        System.out.println(language.startsWith("Java"));
        System.out.println(language.endsWith("python"));

        System.out.println(language.contains("c#"));
        System.out.println(language.contains("c++"));
        System.out.println(language.contains("Pascal"));

        System.out.println(language.replace("python", "Python"));

        Scanner scanner = new Scanner(System.in);
        scanner.next();
        scanner.nextLine();

        scanner.close();
    }

}
