import java.util.*;
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}

class Library {
    private String name;
    private String address;
    private ArrayList<Book> books;

    public Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Available books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("-----------------------------");
        }
    }
}

class Member {
    private String name;
    private String address;
    private List<Book> borrowedBooks;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " has borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " has returned the book: " + book.getTitle());
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        // Create a library object
        Library library = new Library("Library_management_System", "ITC_Infotech_Bangalore");

        // Add books to the library
        Book book1 = new Book("Java Programming", "AbhinayTripathy", "12372367530");
        Book book2 = new Book("Python Basics", "Vineet", "09436388321");
        Book book3 = new Book("C++ Essentials", "AnimishTripathy", "566763jj724");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create member objects
        Member member1 = new Member("VineetVishnu", "Bettiah");
        Member member2 = new Member("Shivam", "Begusarai");

        // Simulate borrowing and returning books
        member1.borrowBook(book1);
        member2.borrowBook(book2);
        member1.borrowBook(book3);
        member1.returnBook(book1);
        member2.returnBook(book2);

        // Display available books in the library
        library.displayBooks();
    }
}

