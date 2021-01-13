package Students.dao;

import Students.model.Student;

import java.util.List;
import java.util.UUID;

public interface StudentPersonDataAccesService {

   void insertStudent(Student student);

   void selectAllStudents();

   void selectStudFaculty(String faculty);
}
