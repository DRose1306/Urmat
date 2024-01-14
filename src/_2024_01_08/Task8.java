package _2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task8 {
    public static void main(String[] args) {
        // Суммирование списка чисел

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        m3(numbers);
    }

    private static void m3(List<Integer> numbers) {
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum);
        sum.ifPresent(el->  System.out.println("sum = " + el));
    }
}
