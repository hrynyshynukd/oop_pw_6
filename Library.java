import java.util.*;

public class Library {
    private String name;
    private String address;
    private int foundedYear;
    private List<Section> sections = new ArrayList<>();

    public Library(String name, String address, int foundedYear) {
        this.name = name;
        this.address = address;
        this.foundedYear = foundedYear;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void removeSection(Section section) {
        sections.remove(section);
    }

    public List<Section> getSections() {
        return sections;
    }

    public String getInfo() {
    return name + ", " + address + " (" + foundedYear + ")";
    }
}