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
        if (!folder.isDirectory())
            return;

        // Filter image files
        File[] imageFilesArray = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".png") ||
                name.toLowerCase().endsWith(".gif"));
        File[] subdirectories = folder.listFiles(File::isDirectory);

        List<ImageFile> imageFiles = new ArrayList<>();
        if (imageFilesArray != null) {
            for (File imageFile : imageFilesArray) {
                imageFiles.add(new ImageFile(imageFile.getName(), imageFile.getAbsolutePath()));
            }
        }

        HtmlGenerator htmlGenerator = new HtmlGenerator(folder, rootPath);

        try {
            // Always generate index.html, even for empty folders
            List<File> subdirList = subdirectories != null ? Arrays.asList(subdirectories) : new ArrayList<>();
            htmlGenerator.generateIndexPage(imageFiles, subdirList);

            // Generate individual image pages
            for (ImageFile imageFile : imageFiles) {
                htmlGenerator.generateImagePage(imageFile);
            }

            // Recursively scan subdirectories
            if (subdirectories != null) {
                for (File subdir : subdirectories) {
                    scanDirectory(subdir);
                }
            }

            System.out.println(
                    "index.html and individual image pages have been created for directory: " + folder.getName());
        } catch (IOException e) {
            System.err.println("Error while generating HTML files: " + e.getMessage());
        }
    }
}
