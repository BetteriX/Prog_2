import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Give a path!");
            System.exit(1);
        }
        String rootPath = args[0];

        FileExplorer exp = new FileExplorer(rootPath);
        HtmlGenerator generator = new HtmlGenerator();

        try {
            List<File> directories = exp.getAllDictories();

            for (File dir : directories) {
                System.out.println(dir.getAbsolutePath());
                List<File> images = exp.getImagesInDictory(dir);

                List<File> sub_directories = exp.getAllDictories();

                for (File image : images) {
                    generator.generateImageHtml(image, dir);
                }

                if (!images.isEmpty()) {
                    generator.generateIndexHtml(rootPath, dir, images, sub_directories);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
