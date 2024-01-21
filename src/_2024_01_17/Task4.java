package _2024_01_17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        // Напишите метод, который преобразует Map в список значений.
        Map<String, List<String>> map = new HashMap<>();
        map.put("Собака", Arrays.asList("Зубы", "Хвост"));
        map.put("Кошка", Arrays.asList("Когти", "Зрачки"));
        map.put("Корова", Arrays.asList("Рога", "Молоко"));
        map.put("Лошадь", Arrays.asList("Копыта", "Мощь"));

        List<String> values = flattenMap(map);
        System.out.println(values);
    }

    static List<String> flattenMap(Map<String, List<String>> map) {

       return map.entrySet().stream()
                .flatMap(el-> el.getValue().stream())
                .toList();
    }
}
