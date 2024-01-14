package _2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task11 {
    public static void main(String[] args) {
//Нахождение суммы чисел, кратных 3 и 5, из списка чисел

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        m8(numbers);
    }

    private static void m8(List<Integer> numbers) {
        Optional<Integer> sum = numbers.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0)
                .reduce(Integer::sum);
        if (sum.isEmpty()) {
            System.out.println("нет чисел кратных 3 и 5");
        } else {
            sum.ifPresent(System.out::println);
        }
    }
}
