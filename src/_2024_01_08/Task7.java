package _2024_01_08;

import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        //Преобразование списка строк в список чисел

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println(m2(strings));
    }

    private static List<Integer> m2(List<String> strings) {

        return strings.stream()
                .map(Integer::parseInt)
                .toList();
    }
}
