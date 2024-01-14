package _2024_01_10.Floats;

import java.util.Arrays;
import java.util.List;

public class Task17 {
    public static void main(String[] args) {
        //Получить список чисел, умноженных на заданное число.
        List<Float> input = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f);
        System.out.println(multiplyBy(input, 2.0f));
    }
    static List<Float> multiplyBy(List<Float> input, float multiplier){

        return input.stream()
                .map(el-> el * multiplier)
                .toList();
    }
}
