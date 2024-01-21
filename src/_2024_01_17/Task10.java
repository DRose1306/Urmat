package _2024_01_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Task10 {
    public static void main(String[] args) {
        //Напишите метод, который объединяет данные из нескольких списков и
        //преобразует их в один список, применяя к каждому элементу определённую функцию.

        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(4.0, 5.0, 6.0);

        List<String> result = combineAndTransform(integers, doubles, String::valueOf);

        System.out.println(result);
    }

    static List<String> combineAndTransform(List<Integer> list1, List<Double> list2, Function<Number, String> transformer) {
        return Stream.concat(list1.stream(), list2.stream())
                .map(transformer)
                .toList();
    }
}
