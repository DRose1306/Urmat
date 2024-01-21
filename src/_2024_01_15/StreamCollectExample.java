package _2024_01_15;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {

    public static void main(String[] args) {
        // Преобразование элементов потока в список
        List<String> names = Stream.of("Alice", "Bob", "Charlie", "David").collect(Collectors.toList());
        System.out.println("List of names: " + names);

        // Удаление дубликатов и создание множества
        Set<Integer> numbers = Stream.of(1, 2, 3, 4, 4, 5, 5).collect(Collectors.toSet());
        System.out.println("Set of unique numbers: " + numbers);

        // Соединение элементов потока в одну строку
        String joinedNames = Stream.of("Alice", "Bob", "Charlie", "David")
                .collect(Collectors.joining(", "));
        System.out.println("Joined names: " + joinedNames);

        // Создание карты, отображающей длину строки в исходную строку
        Map<Integer, String> lengthToNameMap = Stream.of("Alice", "Bob", "Charlie", "David")
                .collect(Collectors.toMap(String::length, s -> s));
        System.out.println("Map of name lengths to names: " + lengthToNameMap);

        // Сортировка элементов потока и сохранение в списке
        List<String> sortedNames = Stream.of("David", "Bob", "Charlie", "Alice")
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list of names: " + sortedNames);

        // Реверс списка с использованием Collections.reverse
        Collections.reverse(sortedNames);
        System.out.println("Reversed list of names: " + sortedNames);
    }
}
