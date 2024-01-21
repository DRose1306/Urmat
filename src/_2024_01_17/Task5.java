package _2024_01_17;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
//Напишите метод, который принимает список списков и фильтрует все четные числа, а затем умножает их на 2.

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 10)
        );
        System.out.println(processAndFilter(listOfLists));
    }

    static List<Integer> processAndFilter(List<List<Integer>> listOfLists) {

        return listOfLists.stream()
                .flatMap(Collection::stream)
                .filter(el -> el % 2 == 0)
                .map(el -> el * 2)
                .toList();
    }
}
