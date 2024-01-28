package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Измените названия всех стримов, добавив к ним префикс "Stream-" и запишите обновленные названия в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task7.txt");) {

            List<String> list = reader.lines()
                    .map(el-> el.replaceAll("Стрим", "Stream"))
                    .toList();


            for (String element : list) {
                writer.write(element + "\n");
            }

            System.out.println("Done");
        }
    }
}
