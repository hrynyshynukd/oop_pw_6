public class Guest extends Reader {
    public Guest(String name) {
        super(name);
    }

    @Override
    public int getMaxBooks() {
        return 2;
    }
}