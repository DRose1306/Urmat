package _2024_01_10;

import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        //Задача: Получить список квадратов чисел.
        List<Integer> input = List.of(1, 2, 3, 4, 5);

        System.out.println(getSquares(input));
    }

    static List<Integer> getSquares(List<Integer> input) {

        return input.stream()
                .map(el -> (int) Math.pow(el, 2))
                .toList();
    }
}
