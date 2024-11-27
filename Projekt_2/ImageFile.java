public class ImageFile {
    private String name;
    private String path;

    public ImageFile(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public String getFileNameWithoutExtension() {
        return name.substring(0, name.lastIndexOf('.'));
    }

    public String getHtmlFileName() {
        return getFileNameWithoutExtension() + ".html";
    }
}
