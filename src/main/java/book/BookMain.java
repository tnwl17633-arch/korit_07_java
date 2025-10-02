package book;

import ch13_inheritance.books.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        String bookTitle = book1.getTitle();
        String bookAuthor = book1.getAuthor();
    }
}
