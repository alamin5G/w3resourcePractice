package OOP;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book aComplete = new Book("123", "A Complete", "Md. Alamin", "Altah", 521);
        Book aguide = new Book("1234", "A Guide", "Md. Arafat", "Altah", 231);

        Book.addBook(aComplete);
        Book.addBook(aguide);

        List<Book> books = aComplete.getBookList();
        for (Book book : books) {
            System.out.println(book);
        }

        boolean b = Book.removeBook(aComplete);
        System.out.println("Is  "+ aComplete.getTitle() +   " by " + aComplete.getAuthor() +" book Removed: " + b);
        books = aComplete.getBookList();
        for (Book book : books) {
            System.out.println(book);
        }

    }
}
