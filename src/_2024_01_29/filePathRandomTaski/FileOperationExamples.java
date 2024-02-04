package _2024_01_29.filePathRandomTaski;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationExamples {

    public static void main(String[] args) throws IOException {
        copyFileUsingFileStreams();
        copyFileUsingPath();
        try {
            copyFileUsingRandomAccessFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //copyFileUsingRandomAccessFile();
    }

    // Задание 1: Работа с классом File

    /**
     * Написать метод, который создает файл с именем
     * "example.txt" в текущей директории, затем считывает
     * этот файл с использованием FileInputStream и записывает
     * его содержимое в новый файл "copy_example.txt" с использованием FileOutputStream.
     */
    private static void copyFileUsingFileStreams() throws IOException, RuntimeException {
        File file = new File("example.txt");

        file.createNewFile();

        if (!file.exists()) {
            throw new FileNotFoundException("Файл example.txt не найден");
        }
        FileInputStream in = new FileInputStream("example.txt");

        try (FileWriter fileWriter = new FileWriter("example.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.newLine();
            bufferedWriter.write("Привет aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            System.out.println("Добавлена запись в файл");

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileOutputStream out = new FileOutputStream("copy_example.txt");

        in.close();
        out.close();
    }
    // Задание 2: Работа с классом Path

    /**
     * Написать метод, который использует Path и Files
     * для копирования файла "example.txt" в новый файл "copy_example_path.txt".
     * Проверить, существует ли файл "example.txt" перед копированием.
     */
    private static void copyFileUsingPath() throws IOException {
        File file = new File("copy_example.txt");

        if (file.exists()) {
            Path path = Paths.get("copy_example.txt");
            File newFile = new File("copy_example_path.txt");
            path.toFile().renameTo(newFile);
            System.out.println("Done");
        } else {
            throw new FileNotFoundException("Файл example.txt не найден");
        }
    }

    // Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, читает первые 20 байт и записывает
     * их в новый файл "random_access_copy.txt".
     */
    private static void copyFileUsingRandomAccessFile() throws IOException {
        try (RandomAccessFile sourceFile = new RandomAccessFile("example.txt", "r");
             RandomAccessFile destinationFile = new RandomAccessFile("random_access_copy.txt", "rw")) {

            byte[] buffer = new byte[20];
            int bytesRead = sourceFile.read(buffer);
            destinationFile.write(buffer, 0, bytesRead);
        }
        System.out.println("Done");
    }
}

