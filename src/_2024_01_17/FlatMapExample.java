package _2024_01_17;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("mama", "myla", "ramu");
        List<String> characters = words.stream()
                .flatMap(str -> Arrays.stream(str.split("")))
                .filter(el -> el.equals("m"))
                .toList();

//        System.out.println(characters);

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 10)
        );

//        list.stream()
//                .flatMap(Collection::stream)
//                .filter(n -> n % 2 == 0)
//                .forEach(System.out::println);

        List<Integer> listA = Arrays.asList(1, 2, 3);
        List<Integer> listB = Arrays.asList(4, 5, 6);

        listA.stream() // 1 2 3
                .flatMap(numA -> listB.stream().map(numB -> numA + numB))
                .forEach(System.out::println);
    }
}
