import pack14.*;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library lib = new Library(3);

        lib.acceptBooks();
        lib.displayBooks();

        System.out.print("\nEnter book name to search: ");
        String book = sc.nextLine();
        lib.searchBook(book);

        System.out.print("\nEnter author name to count books: ");
        String author = sc.nextLine();
        lib.countBooksByAuthor(author);
        sc.close();
    }
}