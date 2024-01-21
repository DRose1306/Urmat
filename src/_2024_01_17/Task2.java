package _2024_01_17;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //Напишите метод, который преобразует список объектов с вложенными списками в один список всех вложенных элементов.

        List<User> list = Arrays.asList(new User("Urmat", Arrays.asList("Jump", "Run")),
                new User("Lubov", Arrays.asList("Talk", "Coding")),
                new User("Lana", Arrays.asList("Read", "Write")));

        List<String> skills = getAllSkills(list);
        System.out.println(skills);

    }

    static List<String> getAllSkills(List<User> users) {

        return users.stream()
                .flatMap(el -> el.getSkills().stream())
                .toList();
    }
}


class User {
    private String name;
    private List<String> skills;

    public User(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}
