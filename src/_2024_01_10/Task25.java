package _2024_01_10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task25 {
    public static void main(String[] args) {
        // Подсчитать частоту каждого элемента в списке.
        List<Character> characterList = List.of('A', 'B', 'C', 'D', 'C', 'A');
        Map<Character, Long> map = countFrequency(characterList);

        map.forEach((el, fr) -> System.out.println(el + ":" + fr));
    }

    static <T> Map<T, Long> countFrequency(List<T> input) {
        return input.stream()
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));

    }
}
