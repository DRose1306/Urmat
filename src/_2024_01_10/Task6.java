package _2024_01_10;

import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        //Задача: Найти сумму всех чисел в списке.
        List<Integer> input = List.of(1, 2, 3, 4, 5);

        System.out.println(sumOfList(input));

    }

    static int sumOfList(List<Integer> input) {

        return input.stream()
                .reduce(Integer::sum)
                .get();
    }
}
