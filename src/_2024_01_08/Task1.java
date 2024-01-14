package _2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        filter(numbers, 3);
    }

    //     * -- Отфильтровать нa четные и не четные
    //     * -- Просуммировать все числа
    static void filter(List<Integer> numbers, int k) {
        if (k % 2 == 0) {

            System.out.println("четный числа");
            Optional<Integer> sum = numbers.stream()
                    .filter(el -> el % 2 == 0)
                    .reduce(Integer::sum);
            sum.ifPresent(value -> System.out.println("Sum: " + value));

        } else {

            System.out.println("нечетный числа");
            Optional<Integer> sum = numbers.stream()
                    .filter(el -> el % 2 != 0)
                    .reduce(Integer::sum);
            sum.ifPresent(value -> System.out.println("Sum: " + value));
        }
    }
}
