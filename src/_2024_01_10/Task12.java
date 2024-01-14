package _2024_01_10;

import java.util.List;
import java.util.stream.Collectors;

public class Task12 {
    public static void main(String[] args) {
//Задача: Фильтрация символов по ASCII-значению.

        List<Character> input = List.of('A', 'B', 'C', 'D', 'A', 'E');
        int asciiValue = 65;
        System.out.println(filterByAsciiValue(input, asciiValue));
    }

    static List<Character> filterByAsciiValue(List<Character> input, int ascii) {

        return input.stream()
                .filter(el -> (int) el == ascii)
                .collect(Collectors.toList());

        //или если не равные заданному char
        // return input.stream()
        //                .filter(el -> (int) el != ascii)
        //                .collect(Collectors.toList());
    }
}
