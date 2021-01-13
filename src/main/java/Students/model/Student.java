package Students.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Student {
    @Getter @Setter
    private int id;
    @Getter @Setter
    private String surname;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String dateOfBirthday;
    @Getter @Setter
    private String telephoneNumber;
    @Getter @Setter
    private String faculty;
    @Getter @Setter
    private String course;
    @Getter @Setter
    private String group;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", telephoneNumber=" + telephoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
