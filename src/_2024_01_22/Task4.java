package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Отсортируйте стримы по рейтингу от наибольшего к наименьшему и запишите результаты в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task4.txt");) {

            List<String> list = reader.lines()
                    .sorted(Comparator.comparingDouble(line -> Double.parseDouble(line.split(", ")[1])))
                    //.sorted(Comparator.comparingDouble(line -> Double.parseDouble(line.split(", ")[1])).reversed()) так оно должно было выглядеть, но выдает ошибку
                    .toList();

            for (String element : list) {
                writer.write(element + "\n");
            }

            System.out.println("Done");
        }
    }
}
