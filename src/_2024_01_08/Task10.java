package _2024_01_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        //Преобразование списка объектов класса в список их имен, отсортированных по возрасту
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
        m7(people);
    }

    private static void m7(List<Person> people) {
        List<String> names = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName)
                .toList();
        System.out.println(names);
    }
}

