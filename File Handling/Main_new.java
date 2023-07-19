import java.util.*;
class Book{
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
    public ArrayList<Book> books;

    Library(String name, String address) {
        this.name = name;
        this.address = address;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\nAvailable books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }
    }
}

class Member {
    private String name;
    private String address;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
        this.borrowedBooks = new ArrayList<>();
    }
    public String getName()
    {
        return name;
    }

    public void borrowBook(Library library) {
        Scanner sc = new Scanner(System.in);
        library.displayBooks();

        System.out.print("Enter the index of the book you want to borrow: ");
        int bookIndex = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (bookIndex >= 1 && bookIndex <= library.books.size()) {
            Book book = library.books.get(bookIndex - 1);
            borrowedBooks.add(book);
            library.books.remove(book);
            System.out.println("You have borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Invalid book index!");
        }
    }

    public void returnBook(Library library) {
        if (borrowedBooks.isEmpty()) {
            System.out.println("\nYou have not borrowed any books.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nBooks you have borrowed:");
        for (int i = 0; i < borrowedBooks.size(); i++) {
            Book book = borrowedBooks.get(i);
            System.out.println("Index: " + (i + 1));
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println();
        }

        System.out.print("Enter the index of the book you want to return: ");
        int bookIndex = sc.nextInt();
        sc.nextLine();

        if (bookIndex >= 1 && bookIndex <= borrowedBooks.size()) {
            Book book = borrowedBooks.get(bookIndex - 1);
            borrowedBooks.remove(book);
            library.addBook(book);
            System.out.println("You have returned the book: " + book.getTitle());
        } else {
            System.out.println("Invalid book index!");
        }
    }
}

public class Main_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a library object
        System.out.print("Enter the library name: ");
        String libraryName = sc.nextLine();
        System.out.print("Enter the library address: ");
        String libraryAddress = sc.nextLine();
        Library library = new Library(libraryName, libraryAddress);

        // Adding books to the library
        System.out.print("\nEnter the number of books to add to the library: ");
        int numBooks = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 1; i <= numBooks; i++) {
            System.out.println("\nBook " + i + ":");
            System.out.print("Enter the title: ");
            String title = sc.nextLine();
            System.out.print("Enter the author: ");
            String author = sc.nextLine();
            System.out.print("Enter the ISBN: ");
            String isbn = sc.nextLine();
            Book book = new Book(title, author, isbn);
            library.addBook(book);
        }

        // Create member objects
        System.out.print("\nEnter the number of members: ");
        int numMembers = sc.nextInt();
        sc.nextLine();

        ArrayList<Member> members = new ArrayList<>();
        for (int i = 1; i <= numMembers; i++) {
            System.out.println("\nMember " + i + ":");
            System.out.print("Enter the member name: ");
            String memberName = sc.nextLine();
            System.out.print("Enter the member address: ");
            String memberAddress = sc.nextLine();
            Member member = new Member(memberName, memberAddress);
            members.add(member);
        }

        // Borrowing and returning books
        for (Member member : members) {
            System.out.println("\n" + member.getName() + ", choose an action:");
            System.out.println("1. Borrow a book");
            System.out.println("2. Return a book");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    member.borrowBook(library);
                    break;
                case 2:
                    member.returnBook(library);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            library.displayBooks();
        }
    }
}

