package _2024_01_10;

import java.util.Arrays;
import java.util.List;

public class Task21 {
    public static void main(String[] args) {
        //Задача: Найти количество уникальных элементов в списке.
        List<Character> characterList = List.of('A', 'B', 'C', 'D', 'C', 'A');
        List<Float> floatList = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f, 2.4f);
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 3, 2);
        List<String> stringList = List.of("one", "two", "three", "four", "twiks", "town", "one", "four");

        System.out.print("charList: ");
        System.out.println(countUnique(characterList));
        System.out.print("floatList: ");
        System.out.println(countUnique(floatList));
        System.out.print("integerList: ");
        System.out.println(countUnique(integerList));
        System.out.print("stringList: ");
        System.out.println(countUnique(stringList));

    }

    static <T> long countUnique(List<T> input) {
        return input.stream()
                .distinct()
                .count();
    }
}
