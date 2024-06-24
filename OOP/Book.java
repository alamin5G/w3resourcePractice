package OOP;

import java.util.ArrayList;
import java.util.List;

public class Book implements BookInterface {
    private String ISBN;
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private static List<Book> bookList;

    Book(String ISBN, String title, String author, String publisher, int pages) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        bookList = new ArrayList<Book>();
    }

    public static void addBook(Book book) {

        bookList.add(book);

    }

    public static boolean removeBook(Book book) {
        return bookList.remove(book);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                '}';
    }
}
