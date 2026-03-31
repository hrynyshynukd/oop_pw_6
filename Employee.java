public class Employee extends Reader {
    public Employee(String name) {
        super(name);
    }

    @Override
    public int getMaxBooks() {
        return 10;
    }
}