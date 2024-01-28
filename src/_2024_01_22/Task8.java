package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Task8 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Отфильтруйте стримы с рейтингом ниже 4.7 и преобразуйте их названия, добавив в конец "- Low Rated". Запишите результаты в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task8")) {

            List<String> list = reader.lines()
                    .filter(el -> Double.parseDouble(el.split(", ")[1]) < 4.7)
                    .map(el -> el.concat(" - Low Rated"))
                    .toList();

            for (String element : list) {
                writer.write(element + "\n");
            }

            System.out.println("Done");
        }
    }
}
