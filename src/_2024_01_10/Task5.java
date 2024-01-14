package _2024_01_10;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        // Задача: Подсчёт количества строк, содержащих заданный символ.

        List<String> stringList = List.of("one", "two", "three", "four", "twiks", "town", "ast");
        System.out.println(countContainingChar(stringList, 't'));

    }

    static long countContainingChar(List<String> input, char ch) {
        if (input.isEmpty()) {
            return -1;
        }

        return input.stream()
                .filter(el -> el.contains(String.valueOf(ch)))
                .count();


    }
}
