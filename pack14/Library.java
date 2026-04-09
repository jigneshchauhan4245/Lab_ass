package pack14;

import java.util.Scanner;

public class Library {

    String bookNames[];
    String authorNames[];
    int totalBooks;

    public Library(int totalBooks) {
        this.totalBooks = totalBooks;
        bookNames = new String[totalBooks];
        authorNames = new String[totalBooks];
    }

    public void acceptBooks() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < totalBooks; i++) {
            System.out.print("Enter Book Name: ");
            bookNames[i] = sc.nextLine();

            System.out.print("Enter Author Name: ");
            authorNames[i] = sc.nextLine();
        }
        sc.close();
    }
    public void displayBooks() {
        System.out.println("\n--- Library Books ---");

        for (int i = 0; i < totalBooks; i++) {
            System.out.println("Book: " + bookNames[i]);
            System.out.println("Author: " + authorNames[i]);
        }
    }
    public void searchBook(String bookName) {
        boolean found = false;

        for (int i = 0; i < totalBooks; i++) {
            if (bookNames[i].equalsIgnoreCase(bookName)) {
                System.out.println("\nBook Found!");
                System.out.println("Book: " + bookNames[i]);
                System.out.println("Author: " + authorNames[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook not available");
        }
    }
    public void countBooksByAuthor(String authorName) {
        int count = 0;

        for (int i = 0; i < totalBooks; i++) {
            if (authorNames[i].equalsIgnoreCase(authorName)) {
                count++;
            }
        }

        System.out.println("\nTotal books by " + authorName + ": " + count);
    }
}