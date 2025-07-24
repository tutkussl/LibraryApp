<<<<<<< HEAD
public class Books {
=======
import java.util.ArrayList;
import java.util.Optional;

public class Library {
    private ArrayList<Books> books = new ArrayList<>();
    private int nextId = 1;  // Otomatik artan ID

    public Library() {
        addBook(new Books(0, "To Kill a Mockingbird", "Harper Lee", 1960));
        addBook(new Books(0, "Alchemist", "Paulo Coelho", 1988));
        addBook(new Books(0, "The Da Vinci Code", "Dan Brown", 2003));
        addBook(new Books(0, "Harry Potter and the Deathly Hallows", "J. K. Rowling", 2007));
    }

    public void addBook(Books book) {
        String trimmedName = (book.getName() != null) ? book.getName().trim() : "";
        if (trimmedName.isEmpty()) {
            System.out.println("Book name cannot be empty.");
            return;
        }

        if (trimmedName.length() < 2) {
            System.out.println("Book name must contain at least 2 characters.");
            return;
        }

        boolean exists = books.stream()
                .anyMatch(b -> b.getName().trim().equalsIgnoreCase(trimmedName));
        if (exists) {
            System.out.println("\"" + trimmedName + "\" already exists in the library.");
        } else {
            if (book.getId() == 0) {
                book.setId(nextId++);
            }
            books.add(book);
            System.out.println("\"" + trimmedName + "\" added to the library: " + book.getId());
        }
    }

    public boolean removeBook(String name) {
        String trimmedName = (name != null) ? name.trim() : "";
        Optional<Books> bookToRemove = books.stream()
                .filter(book -> book.getName().trim().equalsIgnoreCase(trimmedName))
                .findFirst();

        if (bookToRemove.isPresent()) {
            books.remove(bookToRemove.get());
            System.out.println("\"" + trimmedName + "\" removed from the library.");
            return true;
        }
        System.out.println("Book \"" + trimmedName + "\" not found in the library.");
        return false;
    }

    public boolean bookExists(String name) {
        String trimmedName = (name != null) ? name.trim() : "";
        return books.stream()
                .anyMatch(book -> book.getName().trim().equalsIgnoreCase(trimmedName));
    }

    public void listAllBooks() {
        System.out.println("ID || Name || Author || Year");
        for (Books book : books) {
            System.out.println(book.getId() + " || " + book.getName() + " || " +
                    book.getAuthor() + " || " + book.getPublishedYear());
        }
    }
>>>>>>> c987aec (Güncellendi)
}
