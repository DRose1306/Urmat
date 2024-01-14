package _2024_01_10;

import java.util.List;
import java.util.Optional;

public class Task14 {
    public static void main(String[] args) {
        // Задача: Найти первый повторяющийся символ.

        List<Character> input = List.of('A', 'B', 'C', 'D', 'C', 'E');
        System.out.println(findFirstDuplicate(input));
    }

    static Optional<Character> findFirstDuplicate(List<Character> input) {

        return input.stream()
                .filter(e -> input.indexOf(e) != input.lastIndexOf(e))
                .findFirst();
    }
}
