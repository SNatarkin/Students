package Students.dao;

import Students.model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentPersonDataAccesServiceImpl implements StudentPersonDataAccesService {
    private List<Student> studentsDao = new ArrayList<Student>();


    public void insertStudent(Student student) {

        studentsDao.add(new Student(student.getId(),
                student.getSurname(), student.getName(),
                student.getCourse(), student.getTelephoneNumber(),
                student.getDateOfBirthday(), student.getFaculty(),
                student.getGroup()));

    }

    public void selectAllStudents() {
        for (Student s:studentsDao) {
            System.out.println(s.toString());
        }
    }

    public void selectStudFaculty(String faculty) {
        studentsDao.stream().filter(student -> student.getFaculty().equals(faculty)).f

        }
    }

