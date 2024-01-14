package _2024_01_08;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");
        System.out.println(filter(words));
        System.out.println();
        System.out.println(uniqueValues(words));
    }

    //Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
    //Получить список слов которые содержат только уникальные символы
    static List<String> filter(List<String> words) {
        return words.stream()
                .filter(el -> el.startsWith("a"))
                .map(String::toUpperCase)
                .toList();
    }
    static List<String> uniqueValues(List<String> words){
        return words.stream()
                .filter(word -> word.chars().distinct().count() == word.length())
                .toList();
    }
}
