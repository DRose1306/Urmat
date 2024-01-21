package _2024_01_15;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedStreamCollectExample {

    public static void main(String[] args) {
        // 1. Группировка строк по длине
        Map<Integer, List<String>> groupedByLength = Stream.of("apple", "banana", "cherry", "date")
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Strings grouped by length: " + groupedByLength);

        // 2. Подсчет повторяющихся элементов и создание мапа
        Map<String, Long> wordCount = Stream.of("apple", "banana", "apple", "cherry", "date", "banana")
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("Word count map: " + wordCount);

        // 3. Собрать только уникальные элементы в список
        List<String> uniqueNames = Stream.of("Alice", "Bob", "Alice", "Charlie", "David")
                .collect(Collectors.collectingAndThen(Collectors.toSet(), ArrayList::new));
        System.out.println("Unique names: " + uniqueNames);

        // 4. Объединение элементов в строку с максимальной длиной
        String longestString = Stream.of("apple", "banana", "cherry", "date")
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("Longest string: " + longestString);

        // 5. Разбиение строки на символы и сбор их в множество
        Set<Character> uniqueCharacters = "hello".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
        System.out.println("Unique characters in 'hello': " + uniqueCharacters);

        // 6. Сбор объектов в кастомную коллекцию
        MyCustomCollection<Person> customCollection = Stream.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35))
                .collect(MyCustomCollection::new, MyCustomCollection::add, MyCustomCollection::addAll);
        System.out.println("Custom collection: " + customCollection);

        // 7. Подсчет суммы значений объектов
        int totalAge = Stream.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35))
                .collect(Collectors.summingInt(Person::getAge));
        System.out.println("Total age: " + totalAge);

        // 8. Группировка по критерию и подсчет среднего
        Map<String, Double> averageAgeByName = Stream.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Alice", 35),
                new Person("Charlie", 40))
                .collect(Collectors.groupingBy(Person::getName, Collectors.averagingInt(Person::getAge)));
        System.out.println("Average age by name: " + averageAgeByName);

        // 9. Объединение значений в мапе в одну строку
        String namesConcatenated = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.collectingAndThen(Collectors.joining(", "), s -> "Names: " + s));
        System.out.println(namesConcatenated);

        // 10. Построение кастомной мапы из элементов
        Map<String, Integer> customMap = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toMap(i -> "Key" + i, i -> i * 2));
        System.out.println("Custom map: " + customMap);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

class MyCustomCollection<T> extends ArrayList<T> {
    // Класс для кастомной коллекции, необходимой для примера №6
}
