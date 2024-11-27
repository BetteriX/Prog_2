import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlGenerator {
    private File folder;
    private String rootPath;

    public HtmlGenerator(File folder, String rootPath) {
        this.folder = folder;
        this.rootPath = rootPath;
    }

    // Method to generate the index.html page for the current folder
    public void generateIndexPage(List<ImageFile> imageFiles, List<File> subdirectories) throws IOException {

        // Create index.html file in the current folder
        File indexFile = new File(folder, "index.html");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(indexFile))) {
            // Start the HTML content with a title
            writer.write("<html><head><title>Kepek</title></head><body>");

            String relativePath = getRelativePathToRoot(folder, new File(rootPath));
            writer.write("<p><a href=\"" + relativePath + "index.html\">Start Page</a></p>");

            // Always add a "Back to Root Gallery" link pointing to the root index.html
            // writer.write("<p><a href=\"\\index.html\">Start</a></p>");

            // If subdirectories exist, list them
            // Display links to subdirectories
            if (!subdirectories.isEmpty()) {
                writer.write("<h2>Directories:</h2><ul>");
                for (File subdir : subdirectories) {
                    File[] subdirImages = subdir.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg") ||
                            name.toLowerCase().endsWith(".png") ||
                            name.toLowerCase().endsWith(".gif"));
                    File[] subSubDirs = subdir.listFiles(File::isDirectory);

                    // Allow subdirectory if it contains images OR further subdirectories
                    if ((subdirImages != null && subdirImages.length > 0) ||
                            (subSubDirs != null && subSubDirs.length > 0)) {
                        String subdirName = subdir.getName();
                        writer.write("<li><a href=\"" + subdirName + "/index.html\">" + subdirName + "</a></li>");
                    }
                }
                writer.write("</ul>");
            }

            // If there are image files, list them with links
            if (!imageFiles.isEmpty()) {
                writer.write("<h2>Images:</h2><ul>");
                for (ImageFile imageFile : imageFiles) {
                    writer.write(
                            "<li><a href=\"" + imageFile.getHtmlFileName() + "\">" + imageFile.getName() + "</a></li>");
                }
                writer.write("</ul>");
            }

            // Close the HTML tags
            writer.write("</body></html>");
        }

    }

    // Method to generate an HTML page for an individual image file
    public void generateImagePage(ImageFile imageFile) throws IOException {
        // Create an HTML file for the image
        File imageHtmlFile = new File(folder, imageFile.getHtmlFileName());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(imageHtmlFile))) {
            // Start the HTML content for the image
            writer.write("<html><head><title>" + imageFile.getName() + "</title></head><body>");
            writer.write("<h1>" + imageFile.getName() + "</h1>");
            writer.write("<img src=\"" + imageFile.getName() + "\" alt=\"" + imageFile.getName() + "\">");
            writer.write("</body></html>");
        }
    }

    private String getRelativePathToRoot(File currentFolder, File rootFolder) {
        StringBuilder relativePath = new StringBuilder();
        File parentFolder = currentFolder;

        // Traverse up the folder structure until we reach the root
        while (parentFolder != null && !parentFolder.getAbsolutePath().equals(rootFolder.getAbsolutePath())) {
            relativePath.insert(0, "../");
            parentFolder = parentFolder.getParentFile();
        }

        return relativePath.toString();
    }
}
