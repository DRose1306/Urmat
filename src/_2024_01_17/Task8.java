package _2024_01_17;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        //Задача 8: Напишите метод, который принимает список объектов с вложенными коллекциями,
        //сортирует вложенные элементы и возвращает отсортированный список всех элементов.

        List<Project> list = Arrays.asList(
                new Project("Projekt1", Arrays.asList("Read", "Write")),
                new Project("Projekt2", Arrays.asList("Sleep", "Eat")),
                new Project("Projekt3", Arrays.asList("Watch", "Sing"))
        );
        System.out.println(getSortedTasks(list));
    }

    static List<String> getSortedTasks(List<Project> projects) {
       return projects.stream()
                .flatMap(el-> el.getTasks().stream())
                .sorted()
                .toList();
    }
}

class Project {
    private String name;
    private List<String> tasks;

    public Project(String name, List<String> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
