package _2024_31_01.taski;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class UniversityProcessor {
    public static void main(String[] args) throws IOException, RuntimeException {

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        FileReader reader = new FileReader("1.yaml");
        UniversityContainer uni = objectMapper.readValue(reader, UniversityContainer.class);

        System.out.println("task1");
        List<Course> courseList = getAllCourses(uni.getUniversity());

        for (Course course : courseList) {
            System.out.println(course.getTitle());
        }
        System.out.println();

        System.out.println("task2");
        Map<String, Long> courseCount = getCoursesCountByDepartment(uni.getUniversity());
        System.out.println(courseCount);
        System.out.println();

        System.out.println("task3");
        List<String> coursesWithMoreThen3Credits = getCoursesWithMoreThanThreeCredits(uni.getUniversity());
        for (String course : coursesWithMoreThen3Credits) {
            System.out.println(course);
        }
        System.out.println();

        System.out.println("task4");
        Set<String> professorsTeachingMultipleCourses = getProfessorsTeachingMultipleCourses(uni.getUniversity());
        System.out.println(professorsTeachingMultipleCourses);
        System.out.println();

        System.out.println("task5");
        Map<String, List<String>> map = getCourseTopicsMap(uni.getUniversity());
        for (Map.Entry<String, List<String>> element : map.entrySet()) {
            System.out.println(element.getKey() + element.getValue());
        }
        System.out.println();

        System.out.println("task6");
        System.out.println(getDepartmentsWithAllCoursesMoreThanThreeCredits(uni.getUniversity()));
        System.out.println();

        System.out.println("task7");
        Map<Integer, List<Course>> task7 = getCoursesGroupedByCredits(uni.getUniversity());
        for (Map.Entry<Integer, List<Course>> course : task7.entrySet()) {
            System.out.println("Courses with " + course.getKey() + " credits: " + course.getValue().stream().map(Course::getTitle).toList()); // как-то так нахимичил чтобы не изменять метод toString класса Course, а то ужас выводился в консоль
            System.out.println();
        }
        System.out.println();

        System.out.println("task8");
        System.out.println("департамент с самым большим количеством курсов: " + getDepartmentWithMostCourses(uni.getUniversity()));
        System.out.println();

        System.out.println("task9");
        Map<String, Double> task9 = getAverageCreditsPerDepartment(uni.getUniversity());
        for (Map.Entry<String, Double> map9 : task9.entrySet()) {
            System.out.println(map9.getKey() + map9.getValue());
        }
            System.out.println();

        System.out.println("Task10");
        System.out.println(getCoursesWithMoreThanTwoTopicsAndDrProfessor(uni.getUniversity()));

    }

    // 1. Получить список всех курсов в университете
    private static List<Course> getAllCourses(University university) {
        return university.getDepartments().stream()
                .flatMap(department -> department.getCourses().stream())
                .toList();
    }

    // 2. Найти количество курсов в каждом департаменте
    private static Map<String, Long> getCoursesCountByDepartment(University university) {
        return university.getDepartments().stream()
                .collect(Collectors.toMap(Department::getName, department -> (long) department.getCourses().size()));
    }

    // 3. Получить список названий всех курсов, которые имеют более 3 кредитов
    private static List<String> getCoursesWithMoreThanThreeCredits(University university) {
        return university.getDepartments().stream()
                .flatMap(department -> department.getCourses().stream())
                .filter(course -> course.getCredits() > 3)
                .map(Course::getTitle)
                .toList();
    }

    // 4. Найти всех профессоров, которые ведут более одного курса
    private static Set<String> getProfessorsTeachingMultipleCourses(University university) {
        Set<String> professors = university.getDepartments().stream()
                .flatMap(department -> department.getCourses().stream())
                .map(Course::getProfessor)
                .collect(Collectors.toSet());

        Set<String> professorsTeachingMultipleCourses = professors.stream()
                .filter(professor ->
                        professors.stream()
                                .filter(p -> p.equals(professor))
                                .count() > 1)
                .collect(Collectors.toSet());

        return professorsTeachingMultipleCourses;


    }

    // 5. Получить мапу курсов, где ключ - название курса, значение - список тем
    private static Map<String, List<String>> getCourseTopicsMap(University university) {
        return university.getDepartments().stream()
                .flatMap(department -> department.getCourses().stream())
                .collect(Collectors.toMap(
                        Course::getTitle,
                        Course::getTopics));
    }

    // 6. Найти департаменты, где все курсы имеют более 3 кредитов
    private static List<String> getDepartmentsWithAllCoursesMoreThanThreeCredits(University university) {
        return university.getDepartments().stream()
                .filter(department -> department.getCourses().stream().allMatch(course -> course.getCredits() > 3))
                .map(Department::getName)
                .toList();

    }

    // 7. Получить список курсов, сгруппированных по количеству кредитов
    private static Map<Integer, List<Course>> getCoursesGroupedByCredits(University university) {
        return university.getDepartments().stream()
                .flatMap(department -> department.getCourses().stream())
                .collect(Collectors.groupingBy(Course::getCredits));
    }

    // 8. Найти департамент с самым большим количеством курсов
    private static String getDepartmentWithMostCourses(University university) {
        return university.getDepartments().stream()
                .max(Comparator.comparingInt(department -> department.getCourses().size()))
                .map(Department::getName)
                .orElse(null);
    }

    // 9. Получить мапу, где ключ - название департамента, а значение - среднее количество кредитов курсов в департаменте
    private static Map<String, Double> getAverageCreditsPerDepartment(University university) {
        return university.getDepartments().stream()
                .collect(Collectors.toMap(Department::getName, department -> department.getCourses().stream()
                        .mapToDouble(Course::getCredits)
                        .average()
                        .orElse(0)));
    }

    // 10. Найти курсы, у которых более 2 тем и профессор начинается на 'Dr.'
    private static List<Course> getCoursesWithMoreThanTwoTopicsAndDrProfessor(University university) {
        return university.getDepartments().stream()
                .flatMap(department -> department.getCourses().stream())
                .filter(course -> course.getTopics().size() > 2)
                .filter(course -> course.getProfessor().startsWith("Dr."))
                .toList();
    }
}
