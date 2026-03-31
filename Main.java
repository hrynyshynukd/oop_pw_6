import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Library System Demo ===");

        Author author = new Author("George", "Orwell", new Date());

        Book book1 = new Book("1984", 1949, author);
        EBook ebook = new EBook("Animal Farm", 1945, author, "PDF", 2.5);

        Section fiction = new Section("Fiction");
        fiction.addBook(book1);
        fiction.addBook(ebook);

        Library library = new Library("City Library", "Main St", 1950);
        library.addSection(fiction);

        Reader student = new Student("Anna");

        System.out.println("\n--- Books in Library ---");
        System.out.println("Book 1: " + book1.getInfo());
        System.out.println("Book 2: " + ebook.getInfo());

        System.out.println("\n--- Reader Info ---");
        System.out.println("Reader type: Student");
        System.out.println("Max books allowed: " + student.getMaxBooks());

        System.out.println("\n--- Rating System ---");
        book1.getRating().addRating(5);
        book1.getRating().addRating(4);
        System.out.println("Ratings added: 5, 4");
        System.out.println("Average rating: " + book1.getRating().getAverage());

        System.out.println("\n=== End of Demo ===");
    }
}