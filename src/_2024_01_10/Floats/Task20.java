package _2024_01_10.Floats;

import java.util.Arrays;
import java.util.List;

public class Task20 {
    public static void main(String[] args) {
        //Округление всех чисел в списке до ближайшего целого.
        List<Float> input = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f, 8.5f);
        System.out.println(roundNumbers(input));
    }

    static List<Integer> roundNumbers(List<Float> input) {

        return input.stream()
                .map(Math::round)
                .toList();
    }
}
