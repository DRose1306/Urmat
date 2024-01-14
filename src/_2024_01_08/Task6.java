package _2024_01_08;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
//Фильтрация списка целых чисел на нечетные числа
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(m1(numbers));
    }

    private static List<Integer> m1(List<Integer> numbers) {

        return numbers.stream()
                .filter(el -> el % 2 != 0)
                .toList();
    }
}
