package _2024_01_10.Floats;

import java.util.Arrays;
import java.util.List;

public class Task18 {
    public static void main(String[] args) {
        // Задача: Отфильтровать числа, меньшие заданного значения.
        List<Float> input = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f);
        System.out.println(filterLessThan(input, 3.3f));
    }

    static List<Float> filterLessThan(List<Float> input, float value) {

        return input.stream()
                .filter(el -> el > value)
                .toList();
    }
}
