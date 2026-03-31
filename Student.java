public class Student extends Reader {
    public Student(String name) {
        super(name);
    }

    @Override
    public int getMaxBooks() {
        return 5;
    }
}