public class Book {
    private String title;
    private int year;
    private Author author;
    private Rating rating = new Rating();

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getInfo() {
        return title + " (" + year + ") - " + author.getFullName();
    }

    public Rating getRating() {
        return rating;
    }
}