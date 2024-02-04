package _2024_01_29.filePathRandomTaski;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.stream.Stream;

public class AdvancedFileOperations {

    public static void main(String[] args) throws IOException {
        countWordsInFile();
        findTxtFilesInDirectory();
        copyLastParagraphUsingRandomAccess();
    }

    // Усложненное Задание 1: Работа с классом File

    /**
     * Написать метод, который читает файл "example.txt",
     * подсчитывает количество слов в файле и записывает это количество
     * в новый файл "word_count.txt". Использовать BufferedReader и BufferedWriter
     * для эффективной работы с текстом.
     */
    public static void countWordsInFile() throws IOException {
        FileReader fileReader = new FileReader("example.txt");
        BufferedReader reader = new BufferedReader(fileReader);

        FileWriter fileWriter = new FileWriter("word_count.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

        long count = reader.lines()
                .flatMap(line -> Stream.of(line.split(" ")))
                .count();

        writer.write(String.valueOf(count));


        reader.close();
        writer.close();

        System.out.println("Done");
    }

    // Усложненное Задание 2: Работа с классом Path

    /**
     * Написать метод, который ищет все файлы с расширением ".txt"
     * в текущей директории и её поддиректориях. Результаты поиска
     * (пути к файлам) записать в файл "found_files.txt".
     */
    public static void findTxtFilesInDirectory() throws IOException {
        File rootFile = new File("/Users/urmat/Documents/Tel Ran/JAVAPRO/Urmat");
        Path rootPath = rootFile.toPath();

        try (Stream<Path> paths = Files.walk(Paths.get("/Users/urmat/Documents/Tel Ran/JAVAPRO/Urmat"))) {
            List<String> pathList = paths.filter(Files::isRegularFile)
                    .filter(path -> path.toString().toLowerCase().endsWith(".txt"))
                    .map(String::valueOf)
                    .toList();

            FileWriter fileWriter = new FileWriter("found_files.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (String path : pathList) {
                writer.write(path);
                writer.write("\n");
            }

            writer.close();
        }
    }
    // Усложненное Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "example.txt"
     * с использованием RandomAccessFile, переходит к последнему абзацу
     * в файле и копирует его содержимое в новый файл "last_paragraph.txt".
     */
    public static void copyLastParagraphUsingRandomAccess() throws IOException {
        try (RandomAccessFile sourceFile = new RandomAccessFile("example.txt", "r");
             RandomAccessFile destinationFile = new RandomAccessFile("last_paragraph.txt", "rw")) {
            //ToDO
        }
        System.out.println("Done");
    }
}
