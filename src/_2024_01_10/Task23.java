package _2024_01_10;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task23 {
    public static void main(String[] args) {
        // Получить последний элемент списка, если он существует.
        List<Character> characterList = List.of('A', 'B', 'C', 'D', 'C', 'A');
        System.out.println(getLastElement(characterList));

        List<Float> floatList = Arrays.asList(1.2f, 2.4f, 3.6f, 4.8f, 6.0f, 7.2f, 2.4f);
        System.out.println(getLastElement(floatList));

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 3, 2);
        System.out.println(getLastElement(integerList));

        List<String> stringList = List.of("one", "two", "three", "four", "twiks", "town", "one", "four");
        System.out.println(getLastElement(stringList));
    }

    static <T> Optional<T> getLastElement(List<T> input) {
        if (input.isEmpty()) {
            System.out.println("no last element");
        }

        return input.stream()
                .skip(input.size() - 1)
                .findFirst();

        //это уже загуглил
       // return input.stream()
                //.reduce((first, second) -> second);
    }
}
