package _2024_02_14.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRegistry {
    //Часть 2:
    //Создайте класс StudentRegistry,
    //который будет содержать Map<Integer, Student>, где ключ - это id студента.
    //Реализуйте в этом классе следующие методы для обработки данных с использованием Stream API:
    //
    //addStudent(Student student) - добавляет студента в реестр.
    //removeStudent(int id) - удаляет студента по идентификатору.
    //findStudentsByMajor(String major) - возвращает список студентов, обучающихся на указанной специальности.
    //calculateAverageGrade() - вычисляет средний балл среди всех студентов.
    //listStudentsByYear(int year) - возвращает список студентов, обучающихся на указанном курсе.
    //
    //getStudent(int id) - возвращает студента по его идентификатору.
    //getTotalNumberOfStudents() - возвращает общее количество студентов.
    //getStudentsWithGradeAbove(double grade) - возвращает список студентов, чей средний балл выше указанного.
    //getAverageGradeByMajor(String major) - вычисляет средний балл среди студентов определенной специальности.
    //isStudentPresent(String email) - проверяет, существует ли студент с заданным email в реестре.
    private Map<Integer, Student> map = new HashMap<>();

    public void addStudent(Student student) {
        map.put(student.getId(), student);
    }

    public void removeStudent(int id) {
        map.remove(id);
    }

    public List<Student> findStudentByMajor(Major major) {
        return map.values().stream()
                .filter(student -> student.getMajor().equals(major))
                .toList();
    }

    public double calculateAverageGrade() {
        return map.values().stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public List<Student> listStudentsByYear(int year) {
        return map.values().stream()
                .filter(student -> student.getYear() == year)
                .toList();
    }

    public Student getStudent(int id) {
        return map.getOrDefault(id, null);
    }

    public int getTotalNumberOfStudents() {
        return map.values().size();
    }

    public List<Student> getStudentsWithGradeAbove(double grade) {
        return map.values().stream()
                .filter(student -> student.getGrade() > grade)
                .toList();
    }

    public double getAverageGradeByMajor(Major major) {
        return map.values().stream()
                .filter(student -> student.getMajor().equals(major))
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public boolean isStudentPresent(String email) {
        return map.values().stream()
                .allMatch(student -> student.getEmail().equals(email));
    }
}
