package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Отфильтруйте стримы, имеющие рейтинг выше 4.5, и запишите их в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("filtred streams.txt")) {

            List<String> stringList = reader.lines()
                    .filter(line -> Double.parseDouble(line.split(", ")[1]) > 4.5d)
                    .toList();

            for (String str : stringList)
                writer.write(str + "\n");
        }
    }
}
