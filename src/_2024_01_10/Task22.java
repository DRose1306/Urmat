package _2024_01_10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task22 {
    public static void main(String[] args) {
        //Определить, является ли список отсортированным.
        List<Character> characterList = List.of('A', 'B', 'C', 'D');
        System.out.println(isSorted(characterList));

        List<Float> floatList = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f, 2.4f);
        System.out.println(isSorted(floatList));

        List<Integer> integerList = List.of(7, 1, 2, 3, 4, 5, 6, 3, 2);
        System.out.println(isSorted(integerList));
    }

    static <T extends Comparable<T>> boolean isSorted(List<T> input) {

        return IntStream.range(0, input.size() - 1)
                .allMatch(i -> input.get(i).compareTo(input.get(i + 1)) <= 0);
    }
}
