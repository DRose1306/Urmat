package _2024_01_10;

import java.util.List;

public class Task8 {
    public static void main(String[] args) {
//Задача: Фильтрация чисел, больших заданного значения.
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        System.out.println(filterGreaterThan(input, 2));
    }

    static List<Integer> filterGreaterThan(List<Integer> input, int minValue) {
        return input.stream()
                .filter(el-> el > minValue)
                .toList();
    }
}
