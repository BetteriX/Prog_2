class Book_data {
    public String Title;
    public String Author;
    public int Pages;

    // Konstructor
    /*
     * public Book_data(String A_Title, String An_Author, int Some_Pages){
     * Title = A_Title;
     * Author = An_Author;
     * Pages = Some_Pages;
     * }
     */
    public Book_data(String Title, String Author, int Pages) {
        this.Title = Title;
        this.Author = Author;
        this.Pages = Pages;
    }
}

public class book {
    public static void main(String[] args) {
        Book_data book1 = new Book_data("Düne", "Frank Herbert", 412);
        // book1.Title = "Düne";
        // book1.Author = "Frank Herbert";
        // book1.Pages = 412;

        System.out.println(book1.Title);
    }
}
