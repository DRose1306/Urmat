package _2024_01_10.Integers;

import java.util.List;
import java.util.Optional;

public class Task10 {
    public static void main(String[] args) {
// Задача: Найти максимальное число в списке.
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        System.out.println(findMax(input));
    }

    static Optional<Integer> findMax(List<Integer> input) {

        return input.stream()
                .max(Integer::compareTo);

        //input.stream()
              //  .reduce(Integer::max);
    }
}
