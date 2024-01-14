package _2024_01_10.Characters;

import java.util.List;

public class Task11 {
    public static void main(String[] args) {
//Задача: Преобразование списка символов в список строк.
        List<Character> input = List.of('a', 'b', 'c', 'd', 'e');

        System.out.println(convertToStringList(input));
    }

    static List<String> convertToStringList(List<Character> input) {

        return input.stream()
                .map(String::valueOf)
                .toList();
    }
}
