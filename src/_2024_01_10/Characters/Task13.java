package _2024_01_10.Characters;

import java.util.List;

public class Task13 {
    public static void main(String[] args) {
//Задача: Проверка, все ли символы в списке заглавные.

        List<Character> input = List.of('A', 'B', 'C', 'D', 'A', 'E');
        System.out.println(areAllUpperCase(input));
    }

    static boolean areAllUpperCase(List<Character> input) {

        return input.stream()
                .allMatch(Character::isUpperCase);
    }
}
