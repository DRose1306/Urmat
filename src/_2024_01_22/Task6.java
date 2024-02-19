package _2024_01_22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) throws RuntimeException, IOException {
        //Соберите статистику по рейтингам (минимальный, максимальный, средний) и запишите ее в новый файл.

        try (BufferedReader reader = new BufferedReader(new FileReader("f.txt"));
             FileWriter writer = new FileWriter("Task6.txt")) {

            double minRating = reader.lines()
                    .mapToDouble(line -> Double.parseDouble(line.split(", ")[1]))
                    .min()
                    .orElse(0.0);

            try (BufferedReader reader2 = new BufferedReader(new FileReader("f.txt"))) {

                double maxRating = reader2.lines()
                        .mapToDouble(line -> Double.parseDouble(line.split(", ")[1]))
                        .max()
                        .orElse(0.0);

                try (BufferedReader reader3 = new BufferedReader(new FileReader("f.txt"))) {

                    double averageRating = reader3.lines()
                            .mapToDouble(line -> Double.parseDouble(line.split(", ")[1]))
                            .average()
                            .orElse(0.0);


                    writer.write("Статистика по рейтингам:" + "\n"
                            + "минимайный рейтинг " + minRating + "\n"
                            + "максимальный рейтинг " + maxRating + "\n"
                            + "средний рейтинг " + averageRating + "\n");

                    System.out.println("Done");
                }
            }
        }
    }
}