package _2024_01_17;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        // Напишите метод, который принимает список списков списков чисел и преобразует его в один список чисел.
        List<List<List<Integer>>> listOfLists = Arrays.asList(
                Arrays.asList(
                        Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6)
                ),
                Arrays.asList(
                        Arrays.asList(7, 8, 9),
                        Arrays.asList(10, 11, 12)
                ),
                Arrays.asList(
                        Arrays.asList(13, 14, 15),
                        Arrays.asList(16, 17, 18)
                )
        );
        System.out.println(flattenDeepListOfLists(listOfLists));

    }

    static List<Integer> flattenDeepListOfLists(List<List<List<Integer>>> deepList) {
        return deepList.stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .toList();
    }
}
