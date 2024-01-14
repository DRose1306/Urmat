package _2024_01_10;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task15 {
    public static void main(String[] args) {
//Задача: Получить обратный список символов.

        List<Character> input = List.of('A', 'B', 'C', 'D', 'E', 'F');
        System.out.println(reverseList(input));

    }

    static List<Character> reverseList(List<Character> input) {

        return input.stream()
                .sorted(Collections.reverseOrder())
                .toList();
    }
}
