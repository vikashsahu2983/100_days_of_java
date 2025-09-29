import java.util.Scanner;

class Book {
    // Non-static variables (har object ke liye alag honge)
    String title;
    String author;
    boolean isIssued;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;  // default available
    }

    // Methods
    void issueBook() {
        isIssued = true;
    }

    void returnBook() {
        isIssued = false;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (isIssued) {
            System.out.println("Status: Issued");
        } else {
            System.out.println("Status: Available");
        }
        System.out.println();
    }
}

public class Library_Book_Issue_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Book 1 input
        System.out.print("Enter title of Book 1: ");
        String title1 = sc.nextLine();
        System.out.print("Enter author of Book 1: ");
        String author1 = sc.nextLine();
        Book book1 = new Book(title1, author1);

        // Book 2 input
        System.out.print("Enter title of Book 2: ");
        String title2 = sc.nextLine();
        System.out.print("Enter author of Book 2: ");
        String author2 = sc.nextLine();
        Book book2 = new Book(title2, author2);

        // Issue Book 1
        book1.issueBook();

        // Display both books
        System.out.println("\nBook Details:");
        book1.displayBook();
        book2.displayBook();

        sc.close();
    }
}
