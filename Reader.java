public abstract class Reader {
    protected String name;

    public Reader(String name) {
        this.name = name;
    }

    public abstract int getMaxBooks();
}