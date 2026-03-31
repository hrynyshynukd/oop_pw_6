import java.util.*;

public class Section {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Section(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String getName() {
    return name;
    }
}