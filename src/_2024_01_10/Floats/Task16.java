package _2024_01_10.Floats;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task16 {
    public static void main(String[] args) {
        //Задача: Найти минимальное число в списке.
        List<Float> input = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f);
        System.out.println(findMin(input));
    }

    static Optional<Float> findMin(List<Float> input) {

       return   input.stream()
                .reduce(Float::min);

    }
}
