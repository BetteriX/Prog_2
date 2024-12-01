public class Images implements Comparable<Images> {
    private String name;

    public Images(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getHtmlFileName() {
        return getFileNameWithoutExtension() + ".html";
    }

    private String getFileNameWithoutExtension() {
        return name.substring(0, name.lastIndexOf('.'));
    }

    // Sorbarendezi abc sorrendbe
    @Override
    public int compareTo(Images o) {
        String first = this.getFileNameWithoutExtension();
        String second = o.getFileNameWithoutExtension();

        return first.compareTo(second);
    }

    // Koordináció miatt kellenek
    private Images previous;
    private Images next;

    public void setPrevious(Images previous) {
        this.previous = previous;
    }

    public void setNext(Images next) {
        this.next = next;
    }

    public Images getPrevious() {
        return previous;
    }

    public Images getNext() {
        return next;
    }

}
