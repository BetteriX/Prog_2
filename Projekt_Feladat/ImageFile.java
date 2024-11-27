public class ImageFile {
    private String name;
    private String path;

    // Koordinációk
    private ImageFile previous;
    private ImageFile next;

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

    // Koordináció miatt kellenek
    public void setPrevious(ImageFile previous) {
        this.previous = previous;
    }

    public void setNext(ImageFile next) {
        this.next = next;
    }

    public ImageFile getPrevious() {
        return previous;
    }

    public ImageFile getNext() {
        return next;
    }
}
