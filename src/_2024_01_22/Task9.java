package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Создайте сводку, включающую идентификатор стрима, название и рейтинг, и запишите ее в новый файл в формате "ID: Название - Рейтинг".

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task9")){

            List<String> list = reader.lines()
                    .map(line -> {
                        String[] parts = line.split("[\\[\\]]"); // не смог ибавиться от запятой перед рейтингом в записанном файле
                        String id = parts[0];
                        String title = parts[1];
                        String rating = parts[2];
                        return "ID: " + id + " - " + title + " - Рейтинг: " + rating;
                    })
                    .toList();

            for (String line : list) {
                writer.write(line + "\n");
            }

            System.out.println("Done");
        }
    }
}
