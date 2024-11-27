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

        File[] imageFilesArray = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") ||
                name.toLowerCase().endsWith(".png") ||
                name.toLowerCase().endsWith(".gif"));
        File[] subdirectories = folder.listFiles(File::isDirectory);

        List<ImageFile> imageFiles = new ArrayList<>();
        for (File imageFile : imageFilesArray) {
            imageFiles.add(new ImageFile(imageFile.getName(), imageFile.getAbsolutePath()));
        }

        // Skip generating HTML if no images and no subdirectories exist
        if (imageFiles.isEmpty() && (subdirectories == null || subdirectories.length == 0)) {
            return;
        }

        HtmlGenerator htmlGenerator = new HtmlGenerator(folder, rootPath);

        try {
            // Generate individual image pages
            for (ImageFile imageFile : imageFiles) {
                htmlGenerator.generateImagePage(imageFile);
            }

            // Generate the index.html page for this directory, including subdirectories
            List<File> subdirList = Arrays.asList(subdirectories);
            htmlGenerator.generateIndexPage(imageFiles, subdirList);

            // Recursively generate index pages for subdirectories
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
