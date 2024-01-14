package _2024_01_10.Strings;

import java.util.List;
import java.util.Optional;

public class Task3 {
    public static void main(String[] args) {
        // Задача: Поиск первой строки, начинающейся на заданную букву.
    }

    static Optional<String> findFirstStartingWith(List<String> input, char letter) {
        Optional<String> str = input.stream()
                .filter(el -> el.charAt(0) == letter)
                .findFirst();

        return str;
    }
}
