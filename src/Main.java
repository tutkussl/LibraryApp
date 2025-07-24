<<<<<<< HEAD
package PACKAGE_NAME;

public class Main {
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("What do you want to do?");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. List all books");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // dummy read
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter book name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter author name:");
                    String author = scanner.nextLine();

                    System.out.println("Enter published year:");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // dummy read

                    int id = 0;
                    library.addBook(new Books(id, name, author, year));

                    System.out.println("\nAll the books in the library:");
                    library.listAllBooks();
                    break;

                case 2:
                    System.out.print("Enter the book name you want to remove: ");
                    String nameToRemove = scanner.nextLine();

                    boolean exists = library.bookExists(nameToRemove);
                    if (!exists) {
                        System.out.println("Book named \"" + nameToRemove + "\" not found in library.");
                    } else {
                        System.out.print("Are you sure you want to delete this book? (y/n): ");
                        String confirm = scanner.nextLine();

                        if (confirm.equalsIgnoreCase("y")) {
                            boolean removed = library.removeBook(nameToRemove);
                            if (removed) {
                                System.out.println(nameToRemove + " removed from library.");
                            }
                        } else {
                            System.out.println("Book removal cancelled.");
                        }
                    }
                    break;

                case 3:
                    library.listAllBooks();
                    break;

                case 4:
                    running = false;
                    break;

                default:
            }
        }

    }
>>>>>>> c987aec (Güncellendi)
}
