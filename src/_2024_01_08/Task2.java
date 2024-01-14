package _2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 30);
        sum(numbers);
    }

    //Найти суммы чисел кратных 3 и 5
    static void sum(List<Integer> numbers) {
        Optional<Integer> reduce = numbers.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .reduce(Integer::sum);
        reduce.ifPresent(el -> System.out.println("sum: " + el));
    }

}

