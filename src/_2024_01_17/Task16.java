package _2024_01_17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task16 {
    public static void main(String[] args) {
        //Каждая школа содержит информацию о своих классах и студентах в этих классах.
        //Задача состоит в том, чтобы вычислить средний балл по каждому предмету среди студентов,
        //чей средний балл по всем предметам выше определённого порога (например, 8.0 из 10).

        Subject math = new Subject("Math", 9.0);
        Subject physics = new Subject("Physics", 8.5);
        Subject chemistry = new Subject("Chemistry", 7.5);

        List<Subject> subjects1 = List.of(math, physics, chemistry);
        List<Student> students1 = List.of(new Student("Student1", subjects1), new Student("Student2", subjects1));
        Map<String, List<Student>> studentsByClass1 = new HashMap<>();
        studentsByClass1.put("ClassA", students1);

        Subject history = new Subject("History", 9.5);
        Subject literature = new Subject("Literature", 8.0);
        Subject geography = new Subject("Geography", 7.0);

        List<Subject> subjects2 = List.of(history, literature, geography);
        List<Student> students2 = List.of(new Student("Student3", subjects2), new Student("Student4", subjects2));
        Map<String, List<Student>> studentsByClass2 = new HashMap<>();
        studentsByClass2.put("ClassB", students2);

        School school1 = new School("School1", studentsByClass1);
        School school2 = new School("School2", studentsByClass2);

        List<School> schools = List.of(school1, school2);

        System.out.println(averageScoreBySubjectForTopStudents(schools));
    }

    static Map<String, Map<String, Double>> averageScoreBySubjectForTopStudents(List<School> schools) {
        return schools.stream()
                .flatMap(school -> school.getStudentsByClass().values().stream().flatMap(List::stream))
                .collect(Collectors.toMap(
                        Student::getName,
                        student -> student.getSubjects().stream()
                                .collect(Collectors.toMap(Subject::getName, Subject::getScore))
                ));
    }
}

class School {
    private String name;
    private Map<String, List<Student>> studentsByClass;

    public School(String name, Map<String, List<Student>> studentsByClass) {
        this.name = name;
        this.studentsByClass = studentsByClass;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Student>> getStudentsByClass() {
        return studentsByClass;
    }
}

class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

class Subject {
    private String name;
    private double score;

    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}
