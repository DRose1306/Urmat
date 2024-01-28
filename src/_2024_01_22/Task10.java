package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class Task10 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Соберите все названия стримов в одну длинную строку, разделяя их запятыми, и запишите эту строку в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task10")) {

            String str = reader.lines()
                    .map(el -> el.split("[\\[\\]]")[1].replaceAll(" ", "").trim())
                    .collect(Collectors.joining(","));

            writer.write(str);

            System.out.println("Done");
        }
    }
}
