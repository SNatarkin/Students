package Students;

import Students.dao.StudentPersonDataAccesService;
import Students.dao.StudentPersonDataAccesServiceImpl;
import Students.model.Student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Иванович", "Иванов", "01.01.1998", "38044555667712", "123", "1", "123");
        StudentPersonDataAccesService one = new StudentPersonDataAccesServiceImpl();
        one.insertStudent(st1);
        Student st2 = new Student(2, "Иванович", "Иванов", "01.01.1998", "38044555667712", "123", "1", "123");
        one.insertStudent(st2);
        one.selectAllStudents();
        one.selectStudFaculty("123");
    }
}
