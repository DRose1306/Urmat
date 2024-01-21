package _2024_01_17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task13 {
    public static void main(String[] args) {
        //Напишите метод, который принимает несколько списков различных типов данных, преобразует их и объединяет в один список.

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        List<Double> doubles = Arrays.asList(1.5, 2.0, 3.7, 4.2, 5.8);

        System.out.println(combineAndTransformComplex(integers, strings, doubles));
    }

    static List<String> combineAndTransformComplex(List<Integer> integers, List<String> strings, List<Double> doubles) {
        /*return integers.stream()
                .flatMap(numA -> strings.stream()
                        .flatMap(strB -> doubles.stream().map(numB -> numA.toString() + strB + numB.toString())))
                .collect(Collectors.toList());*/

        List<String> combinedList = Stream.concat(integers.stream().map(Object::toString),
                        Stream.concat(strings.stream(), doubles.stream().map(Object::toString)))
                .collect(Collectors.toList());

        return combinedList;
    }
}
