public class ImageFile {
    private String name;
    // private String path;

    public ImageFile(String name) {
        this.name = name;
        // this.path = path;
    }

    public String getName() {
        return name;
    }

    // public String getPath() {
    // return path;
    // }

    public String getFileNameWithoutExtension() {
        return name.substring(0, name.lastIndexOf('.'));
    }

    public String getHtmlFileName() {
        return getFileNameWithoutExtension() + ".html";
    }

    private ImageFile previous;
    private ImageFile next;

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
