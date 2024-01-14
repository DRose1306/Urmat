package _2024_01_08;

import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        //:Получение списка слов, содержащих только уникальные символы, из списка строк

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "grape");
        m9(words);
    }

    private static void m9(List<String> words) {
        List<String> unique = words.stream()
                .filter(el -> el.chars().distinct().count() == el.length())
                .toList();
        System.out.println(unique);
    }
}
