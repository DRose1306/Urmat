package _2024_01_22;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Прочитайте файл и посчитайте средний рейтинг всех стримов. Запишите результат в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("average_rating.txt")) {
            double average = reader.lines()
                    .map(line -> line.split(", ")[1])
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .orElse(0.0);
            writer.write("Средний рейтинг: " + average);

        }
    }
}
