package _2024_02_12;

import java.util.stream.Collectors;

// Нарушение KISS:
public class StringUtils {
    public static String toUpperCase(String input) {
        // Сложная реализация для простой операции
        // ...
        return input.chars()
                .mapToObj(Character::toString)
                .map(s -> {
                    // Добавляем дополнительную логику преобразования, например, пропуск знаков препинания
                    if (s.equals(" ")) {
                        return " ";
                    } else {
                        return s.toUpperCase();
                    }
                })
                .collect(Collectors.joining());
    }
    public static String toUpperCase2(String input) {
        return input.replaceAll(" ", "").toUpperCase();
    }
}

