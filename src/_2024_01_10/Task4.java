package _2024_01_10;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.String.*;

public class Task4 {
    public static void main(String[] args) {
        //Задача: Соединение строк через запятую.
        List<String> stringList = List.of("one", "two", "three", "four");
        System.out.println(joinByComma(stringList));
    }

    static String joinByComma(List<String> input) {
        if (input.isEmpty()) {
            return "";
        }

        return input.stream()
                .collect(Collectors.joining(", "));
    }
}
