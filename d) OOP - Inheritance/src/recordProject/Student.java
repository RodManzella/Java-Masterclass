package recordProject;

public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", classList=" + classList
                + "]";
    }

    

    
    
}

// Let´s make make this a Plain Old Java Object. A POJO in its simplest form required a way to populate data, and we can do this
// with a constructor.
