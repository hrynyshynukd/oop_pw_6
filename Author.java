import java.util.Date;

public class Author {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Author(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}