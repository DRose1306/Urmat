package _2024_01_08;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        averegeValue(numbers);
    }

    //Получить среднее значение
    static void averegeValue(List<Integer> numbers) {
        OptionalDouble average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        average.ifPresent(el -> System.out.println("Average Value: " + el));


    }
}
