package _2024_01_10;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
// Задача: Проверка, содержит ли список заданное число.
        List<Integer> input = List.of(1, 2, 3, 4, 5);

        System.out.println(containsNumber(input, 3));

    }

    static boolean containsNumber(List<Integer> input, int number){

        return input.stream()
                .anyMatch(el-> el == number);
    }
}
