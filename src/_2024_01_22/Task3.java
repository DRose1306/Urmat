package _2024_01_22;

import java.io.*;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Сгруппируйте стримы по названию и запишите количество стримов в каждой группе в новый файл.
        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task3")) {

            Map<String, Long> map = reader.lines()
                    .sorted()
                    .collect(Collectors.groupingBy(line -> line.split("[\\[\\]]")[1], Collectors.counting()));

            for (Map.Entry<String, Long> element : map.entrySet()) {
                writer.write(element.getKey() + " " + element.getValue() + "\n");
            }
        }
    }
}
