package _2024_01_10.Floats;

import java.util.Arrays;
import java.util.List;

public class Task19 {
    public static void main(String[] args) {
        // Задача: Проверить, содержит ли список отрицательные числа.
        List<Float> input = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, -1.3f, 6.0f, 7.2f);
        System.out.println(containsNegative(input));
    }

    static boolean containsNegative(List<Float> input) {

        return input.stream()
                .anyMatch(el -> el < 0);

    }
}
