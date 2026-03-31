public class EBook extends Book {
    private String format;
    private double sizeMB;

    public EBook(String title, int year, Author author, String format, double sizeMB) {
        super(title, year, author);
        this.format = format;
        this.sizeMB = sizeMB;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " [EBook: " + format + ", " + sizeMB + "MB]";
    }
}