package _2024_02_14.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StudentRegistryTest {
    private final StudentRegistry studentRegistry = new StudentRegistry();
    private final Student testStudent = new Student(1, "Иван", "Иванов", "ivan@example.com", 85.0, Major.ENGINEER, 2, true);
    private Map<Integer, Student> testMap = new HashMap<>();

    @Test
    void addStudentTest() {
        studentRegistry.addStudent(testStudent);
        Assertions.assertEquals(testStudent, studentRegistry.getStudent(1));
    }

    @Test
    void removeStudentTest() {
        studentRegistry.removeStudent(1);
        Assertions.assertFalse(testMap.containsValue(testStudent));
    }

    @Test
    void findStudentByMajorTest() {
        studentRegistry.addStudent(testStudent);
        List<Student> engineerStudents = studentRegistry.findStudentByMajor(Major.ENGINEER);
        Assertions.assertEquals(1, engineerStudents.size());
        Assertions.assertTrue(engineerStudents.contains(testStudent));
    }

    @Test
    void calculateAverageGradeTest() {
        studentRegistry.addStudent(testStudent);
        Assertions.assertEquals(testStudent.getGrade(), studentRegistry.calculateAverageGrade());
    }

    @Test
    void listStudentsByYearTest() {
        studentRegistry.addStudent(testStudent);
        List<Student> studentsByYear = studentRegistry.listStudentsByYear(testStudent.getYear());
        Assertions.assertEquals(1, studentsByYear.size());
        Assertions.assertTrue(studentsByYear.contains(testStudent));
    }

    @Test
    void getStudentTest() {
        studentRegistry.addStudent(testStudent);
        Assertions.assertEquals(testStudent, studentRegistry.getStudent(testStudent.getId()));
    }

    @Test
    void getTotalNumberOfStudentsTest() {  //спросить про этот метод
        studentRegistry.addStudent(testStudent);
        Assertions.assertEquals(1, studentRegistry.getTotalNumberOfStudents());
    }

    @Test
    void getStudentsWithGradeAboveTest() {
        studentRegistry.addStudent(testStudent);
        List<Student> students = studentRegistry.getStudentsWithGradeAbove(80);
        Assertions.assertEquals(1, students.size());
        Assertions.assertTrue(students.contains(testStudent));
    }

    @Test
    void getAverageGradeByMajorTest() {
        studentRegistry.addStudent(testStudent);
        Assertions.assertEquals(testStudent.getGrade(), studentRegistry.getAverageGradeByMajor(Major.ENGINEER));

    }

    @Test
    void isStudentPresentTest() {
        studentRegistry.addStudent(testStudent);
        Assertions.assertTrue(studentRegistry.isStudentPresent(testStudent.getEmail()));
    }
}