package _2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        parseInt(strings);
    }

    //Преобразовать список строк в список чисел
    static void parseInt(List<String> strings) {
        List<Integer> list = strings.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list);
    }
}
