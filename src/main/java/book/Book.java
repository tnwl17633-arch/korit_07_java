package book;

public class Book {
    private final String book;
    private Object ebook = null;
    private String title;
    String author;

    public Book(String book, String eBook) {
        this.book = book;
        this.ebook = ebook;
    }

    public Book(double fileSize, String book) {
        this.book = book;
    }


    protected void showInfo() {
    }
}
