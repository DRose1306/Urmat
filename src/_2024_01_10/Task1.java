package _2024_01_10;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        System.out.println(filterByLength(words, 5));
    }

    //1. Задача: Фильтрация списка строк по длине.
    static List<String> filterByLength(List<String> input, int length) {
        return input.stream()
                .filter(el -> el.length() > length)
                .toList();

    }
}

