package _2024_01_22;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Найдите стримы с минимальным рейтингом и выведите их в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task5.txt");) {

            List<String> list = reader.lines()
                    .collect(Collectors.groupingBy(line -> Double.parseDouble(line.split(", ")[1]),
                            Collectors.toList()))
                    .entrySet().stream()
                    .min(Comparator.comparingDouble(Map.Entry::getKey))
                    .map(Map.Entry::getValue)
                    .orElse(List.of());

            for (String line : list) {
                writer.write(line + "\n");
            }

            System.out.println("Done");
        }
    }
}
