import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Display {
    private String rootPath;
    private boolean Debug;

    public Display(String rootPath) {
        this.rootPath = rootPath;
        this.Debug = false;
    }

    public Display(String rootPath, boolean Debug) {
        this.rootPath = rootPath;
        this.Debug = Debug;
    }

    public void Display_Main() {
        File rootFolder = new File(rootPath);

        if (!rootFolder.exists() || !rootFolder.isDirectory()) {
            System.out.println("Invalid folder path.");
            System.exit(1);
        }

        scanDirectory(rootFolder);
    }

    private void scanDirectory(File folder) {
        // Képek tárolása
        File[] imagesArray = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".png") ||
                name.toLowerCase().endsWith(".jpeg"));

        // Mappák tárolása
        File[] subdirectories = folder.listFiles(File::isDirectory);

        List<Images> current_images = new ArrayList<>();
        for (File imageFile : imagesArray) {
            current_images.add(new Images(imageFile.getName()));
        }

        // Saját sorbarendezés abc sorrendbe
        Collections.sort(current_images);

        // Navigáció a képek között
        for (int i = 0; i < current_images.size(); i++) {
            Images current = current_images.get(i);
            if (i > 0) {
                current.setPrevious(current_images.get(i - 1));
            }
            if (i < current_images.size() - 1) {
                current.setNext(current_images.get(i + 1));
            }
        }

        HtmlGenerator htmlGenerator = new HtmlGenerator(folder, rootPath);

        try {
            // Ez generálja az index.html-eket
            // A subdirlist felsorolja a mappában lévő elérhető más mappákat majd felsorolja
            List<File> subdirList = Arrays.asList(subdirectories);

            // Sorba rendezi abc sorrendbe a mappák nevét
            Collections.sort(subdirList);

            htmlGenerator.generateIndexPage(current_images, subdirList);

            // Ez generálja a Képes HTML-eket
            for (Images imageFile : current_images) {
                htmlGenerator.generateImagePage(imageFile);
            }

            // Rekurzív szkennelés - Ha végzik
            for (File subdir : subdirectories) {
                scanDirectory(subdir);
            }

            if (this.Debug == true) {
                System.out.println(folder.getAbsolutePath());
            }
        } catch (IOException e) {
            System.err.println("Hiba: " + e.getMessage());
        }
    }
}
