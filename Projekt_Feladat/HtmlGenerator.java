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

    // Generálja az index.html, minden külön mappába
    public void generateIndexPage(List<Images> images, List<File> subdirectories) throws IOException {
        // Előre létrehozza a fájl-t
        File indexFile = new File(folder, "index.html");

        // Szerkesztük a fájl-t
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(indexFile))) {
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("\t<head>\n");
            writer.write("\t\t<title>Index</title>\n");
            writer.write("\t</head>\n");
            writer.write("\t<body>\n");

            // A relatív távolságával visszalehet menni a fő mappába
            String relativePath = getRelativePathToRoot(folder, new File(rootPath));
            writer.write("\t<h2><a href=\"" + relativePath + "index.html\">Start Page</a></h2>\n");

            // Huzz egy csíkót
            writer.write("\t<div style=\"height: 2px; background-color: black;\"></div>\n");

            writer.write("\t<h2>Directories:</h2>\n");

            // Akkor írja ki hogyha nem a gyökér mappában van
            if (!relativePath.equals("")) {
                writer.write("<p><a href=../index.html>&lt;&lt;</a></p>");
            }

            // Felsorolja az alkönyvtárakat
            writer.write("\t<ul>\n");
            for (File subdir : subdirectories) {
                String subdirName = subdir.getName();
                writer.write("\t\t<li><a href=\"" + subdirName + "/index.html\">" + subdirName + "</a></li>\n");
            }
            writer.write("\t</ul>\n");

            writer.write("\t<div style=\"height: 2px; background-color: black;\"></div>\n");

            // A képeket kilistáza
            writer.write("\t<h2>Images:</h2>\n");
            writer.write("\t<ul>\n");
            for (Images image : images) {
                writer.write("\t\t<li><a href=\"" + image.getHtmlFileName() + "\">" + image.getName()
                        + "</a></li>\n");
            }
            writer.write("\t</ul>\n");

            writer.write("\t</body>\n");
            writer.write("</html>");
        }
    }

    // Képeket generálja -> {Kép neve}.html formátumban
    public void generateImagePage(Images image) throws IOException {
        File imageHtmlFile = new File(folder, image.getHtmlFileName());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(imageHtmlFile))) {
            writer.write("<!DOCTYPE html>\n");
            writer.write("<html>\n");
            writer.write("\t<head>\n");
            writer.write("\t\t<title>" + image.getName() + "</title>\n");
            writer.write("\t</head>\n");
            writer.write("\t<body>\n");

            // A relatív távolságával visszalehet menni a fő mappába
            String relativePath = getRelativePathToRoot(folder, new File(rootPath));
            writer.write("\t<h2><a href=\"" + relativePath + "index.html\">Start Page</a></h2>\n");

            writer.write("\t<div style=\"height: 2px; background-color: black;\"></div>\n");

            // Visszamegy az aktuális index.html-be
            writer.write("\t<p><a href=\"index.html\">^^</a></p>\n");

            // Koordinációk deklarációja
            Images prevImage = image.getPrevious();
            Images nextImage = image.getNext();

            // Egyvonalba lesznek így (<< {File.jpg} >>)
            writer.write("\t<div style=\"display: inline;\">\n");

            // Navigation: Ha visszamegy
            // &lt; == <
            if (prevImage != null) {
                writer.write("\t\t<a href=\"" + prevImage.getHtmlFileName() + "\">&lt;&lt;</a>\n");
            } else {
                writer.write("\t\t<a href=\"" + image.getHtmlFileName() + "\">&lt;&lt;</a>\n");
                // Ha pedig nincs semmi akkor semmit sem csinál
            }

            writer.write("\t\t<h2 style=\"display: inline;\">" + image.getName() + "</h2>\n");

            // Navigation: Köv. kép
            if (nextImage != null) {
                writer.write("\t\t<a href=\"" + nextImage.getHtmlFileName() + "\">>></a>\n");
            } else {
                writer.write("\t\t<a href=\"" + image.getHtmlFileName() + "\">>></a>\n\n");
                // Ha pedig nincs semmi akkor semmit sem csinál
            }

            writer.write("\t</div>\n");

            // Sörtéres a kép előtt
            writer.write("\t<br><br>\n");

            // Kép kííratása
            // Egy Javascript functional meghíva, ami rákkatintáskor fog münködni
            // (goToNextImage())
            writer.write("\t<img src=\"" + image.getName() + "\" alt=\"" + image.getName()
                    + "\" onclick=\"goToNextImage()\"/>\n");

            // JavaScript
            writer.write("\t<script>\n");
            writer.write("\t\tfunction goToNextImage() {\n");
            if (nextImage != null) {
                writer.write("\t\twindow.location.href = '" + nextImage.getHtmlFileName() + "';\n");
            }
            writer.write("\t}\n");
            writer.write("\t</script>\n");

            writer.write("\t</body>\n");
            writer.write("</html>");
        }
    }

    // Azt ellenőrzi hogy milyen távol van a fő mappától így a relatív távolságát
    // adja vissza
    private String getRelativePathToRoot(File currentFolder, File rootFolder) {
        StringBuilder relativePath = new StringBuilder();
        File parentFolder = currentFolder;

        // Addig megy míg el nem éri a fő mappát
        while (!parentFolder.equals(rootFolder)) {
            relativePath.append("../");
            parentFolder = parentFolder.getParentFile(); // Visszalépteti 1-el
        }

        return relativePath.toString();
    }
}
