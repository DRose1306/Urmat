package _2024_01_15.taski2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

//уровень 7
public class TASKI2 {

    //Напишите метод, который принимает список чисел и возвращает сумму квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(el -> el % 2 != 0)
                .mapToInt(el -> (int) Math.sqrt(el))
                .sum();
    }


    //Напишите метод, который принимает список строк и возвращает список уникальных слов, отсортированных в лексикографическом порядке.
    public static List<String> uniqueSortedWords(List<String> strings) {
        return strings.stream()
                .flatMap(el -> Stream.of(el.split("")))
                .distinct()
                .sorted()
                .toList();
    }


    //Напишите метод, который принимает список объектов и возвращает новый список, содержащий
    // только объекты, у которых определенное поле имеет заданное значение.
    public static <T> List<T> filterByField(List<T> objects, String fieldName, Object value) throws NoSuchFieldException {
        return objects.stream()
                .filter(el -> el.equals(fieldName))
                .toList();
        //знаю что неверно, но не знаю пока как работать с исключениями, и не хочу мухлевать с чатом GPT
    }


    //Напишите метод, который принимает список строк и возвращает список строк, содержащих
    // только уникальные символы (т.е. символы, которые не повторяются в строке).
    public static List<String> uniqueChars(List<String> strings) {
        return strings.stream()
                .filter(word -> word.chars().distinct().count() == word.length())
                .toList();
    }

    //Напишите метод, который принимает список строк и возвращает самую длинную строку в списке.
    public static String longestString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }

    //Напишите метод, который принимает список объектов и
    // возвращает среднее значение заданного числового поля всех объектов в списке.
    public static <T> double averageFieldValue(List<T> objects, String fieldName) throws NoSuchFieldException {
// не знаю пока как работать с исключениями, и не хочу мухлевать с чатом GPT
        return 0;
    }
}
