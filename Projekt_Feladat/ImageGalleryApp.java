import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageGalleryApp {
    private String rootPath;

    public ImageGalleryApp(String rootPath) {
        this.rootPath = rootPath;
    }

    public void generateGallery() {
        File rootFolder = new File(rootPath);

        if (!rootFolder.exists() || !rootFolder.isDirectory()) {
            System.out.println("Invalid folder path.");
            return;
        }

        scanDirectory(rootFolder);
    }

    private void scanDirectory(File folder) {
        // Szűri a képfájlokat
        File[] imageFilesArray = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".png") ||
                name.toLowerCase().endsWith(".jpeg"));

        // Eltárolja az almappákat
        File[] subdirectories = folder.listFiles(File::isDirectory);

        // Eltárolja a listában a Nevét majd az abszolút elérési útját
        List<ImageFile> imageFiles = new ArrayList<>();
        if (imageFilesArray != null) {
            for (File imageFile : imageFilesArray) {
                imageFiles.add(new ImageFile(imageFile.getName()));
            }
        }

        // Navigáció a képek között
        for (int i = 0; i < imageFiles.size(); i++) {
            ImageFile current = imageFiles.get(i);
            if (i > 0) {
                current.setPrevious(imageFiles.get(i - 1));
            }
            if (i < imageFiles.size() - 1) {
                current.setNext(imageFiles.get(i + 1));
            }
        }

        HtmlGenerator htmlGenerator = new HtmlGenerator(folder, rootPath);

        try {
            // Ez generálja az index.html-eket
            // A subdirlist felsorolja a mappában lévő elérhető más mappákat majd felsorolja
            // őket
            List<File> subdirList = subdirectories != null ? Arrays.asList(subdirectories) : new ArrayList<>();
            htmlGenerator.generateIndexPage(imageFiles, subdirList);

            // Ez generálja a Képes HTML-eket
            for (ImageFile imageFile : imageFiles) {
                htmlGenerator.generateImagePage(imageFile);
            }

            // Rekurzív szkennelés
            if (subdirectories != null) {
                for (File subdir : subdirectories) {
                    scanDirectory(subdir);
                }
            }

            System.out.println(folder.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error while generating HTML files: " + e.getMessage());
        }
    }
}
