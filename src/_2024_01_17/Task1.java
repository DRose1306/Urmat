package _2024_01_17;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        // Напишите метод, который принимает список списков целых чисел
        //и преобразует его в один список
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 10)
        );
        List<Integer> newList = flattenListOfLists(listOfLists);
        System.out.println(newList);
    }

    static List<Integer> flattenListOfLists(List<List<Integer>> listOfLists) {

       return listOfLists.stream()
                .flatMap(Collection::stream)
                .toList();
    }
}
