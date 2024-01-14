package _2024_01_08;

import java.util.Arrays;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        //Получение списка уникальных слов из списка строк, длина которых больше 4 символов

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        System.out.println(m6(words));
    }

    private static List<String> m6(List<String> words) {
        return words.stream()
                .filter(el -> el.length() > 4)
                .filter(el -> el.chars().distinct().count() == el.length())
                .toList();
    }
}
