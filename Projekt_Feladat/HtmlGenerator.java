import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HtmlGenerator {

    // Generate HTML for an individual image
    public void generateImageHtml(File image, File directory) {
        String htmlContent = "<html><head><title>" + image.getName() + "</title></head><body>";
        htmlContent += "<h1>" + image.getName() + "</h1>";
        htmlContent += "<img src=\"" + image.getName() + "\" alt=\"" + image.getName()
                + "\" style=\"max-width: 100%; height: auto;\" />";
        htmlContent += "<br><br><a href=\"index.html\">Back to Index</a>";
        htmlContent += "</body></html>";

        try {
            File htmlFile = new File(directory, image.getName().replaceFirst("[.][^.]+$", "") + ".html");
            try (FileWriter writer = new FileWriter(htmlFile)) {
                writer.write(htmlContent);
            }
        } catch (IOException e) {
            System.out.println("Error generating HTML for image: " + image.getName());
        }
    }

    // Generate index.html that shows directories on the left (without links) and
    // images on the right
    public void generateIndexHtml(String rootPath, File directory, List<File> images, List<File> subDirectories) {
        StringBuilder htmlContent = new StringBuilder(
                "<html><head><title>Index of " + directory.getName() + "</title></head><body>");

        // Styling the layout with CSS for the left (directories) and right (images)
        // columns
        htmlContent.append("<style>")
                .append("body {font-family: Arial, sans-serif; display: flex;} ")
                .append(".left {width: 20%; padding: 10px; border-right: 2px solid #000;} ")
                .append(".right {width: 80%; padding: 10px;} ")
                .append(".directory-list, .image-list {list-style-type: none; padding: 0;} ")
                .append(".directory-list li, .image-list li {margin: 5px 0;} ")
                .append(".directory-list span, .image-list a {text-decoration: none; color: #000;} ")
                .append(".directory-list span:hover, .image-list a:hover {color: #007BFF;} ")
                .append("</style>");
        htmlContent.append("<body><div class=\"left\">");

        // List directories on the left (without links, just names)
        htmlContent.append("<h2>Directories:</h2>");
        htmlContent.append("<ul class=\"directory-list\">");
        for (File subDir : subDirectories) {
            String subDirName = subDir.getName();
            // Just show the directory names, no links
            htmlContent.append("<li><span>" + subDirName + "</span></li>");
        }
        htmlContent.append("</ul></div>");

        // List images on the right with links
        htmlContent.append("<div class=\"right\"><h2>Images:</h2><ul class=\"image-list\">");
        for (File image : images) {
            String imageName = image.getName();
            htmlContent.append("<li><a href=\"" + image.getName().replaceFirst("[.][^.]+$", "") + ".html\">" + imageName
                    + "</a></li>");
        }
        htmlContent.append("</ul></div></body></html>");

        try {
            // Write the index.html to the directory
            File indexFile = new File(directory, "index.html");
            try (FileWriter writer = new FileWriter(indexFile)) {
                writer.write(htmlContent.toString());
            }
        } catch (IOException e) {
            System.out.println("Error generating index.html for directory: " + directory.getName());
        }
    }
}
