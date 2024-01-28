package _2024_01_24.taski;

import _2024_01_24.PersonTemplate1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    /**
     * Создайте объекты класса Book для каждой строки.
     * Используйте Stream API для преобразования строк в объекты.
     * Сериализуйте список книг в файл с использованием ObjectOutputStream.
     */
    public static void main(String[] args) throws RuntimeException, IOException {

        List<Book> books = readBooks("taski.txt");
        System.out.println("Before Serialization");
        System.out.println(books.toString());
        System.out.println();

        FileOutputStream fileOut = new FileOutputStream("Books.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(books);
        fileOut.close();
        out.close();

        System.out.println("Serialized");

    }

    static List<Book> readBooks(String fileName) throws IOException {
        try (Stream<String> lines = new BufferedReader(new FileReader(fileName)).lines()) {
            return lines.map(el -> {
                        String[] row = el.split(", ");
                        int id = Integer.parseInt(row[0]);
                        String title = row[1];
                        String author = row[2];
                        int year = Integer.parseInt(row[3]);
                        int pages = Integer.parseInt(row[4]);
                        return new Book(id, title, author, year, pages);
                    })
                    .toList();

        }
    }
}


class Main1 {

    /**
     * Десериализуйте список книг из файла,
     * созданного в предыдущем задании, используя ObjectInputStream.
     * Используйте Stream API для фильтрации книг, например, по автору или году издания.
     * Результаты сохраните в новый сериализованный файл
     */
    public static void main(String[] args) throws RuntimeException, IOException, ClassNotFoundException {
        System.out.println();
        System.out.println("main1");
        System.out.println();

        FileInputStream inputStream = new FileInputStream("Books.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        List<Book> books2 = (List<Book>) objectInputStream.readObject();

        List<Book> filtredBooks = books2.stream()
                .filter(el -> el.getYear() > 1900)
                .toList();

        inputStream.close();
        objectInputStream.close();

        FileOutputStream fileOut = new FileOutputStream("main1.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(filtredBooks);
        fileOut.close();
        out.close();

        System.out.println("Serialized");

    }
}

class Main2 {

    /**
     * Отфильтруйте книги с ценой выше определенной суммы. Сериализуйте отфильтрованный список книг в файл.
     */
    public static void main(String[] args) throws RuntimeException, IOException, ClassNotFoundException{

        FileInputStream inputStream = new FileInputStream("Books.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        List<Book> books = (List<Book>) objectInputStream.readObject();

        List<Book> filtredBooks = books.stream()
                .filter(el -> el.getPrice() > 450)
                .toList();

        inputStream.close();
        objectInputStream.close();

        FileOutputStream fileOut = new FileOutputStream("main2.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(filtredBooks);
        fileOut.close();
        out.close();

        System.out.println("Serialized");
    }
}

class Main3 {

    /**
     * Агрегируйте данные, например, подсчитайте среднюю цену книг по каждому автору. Сериализуйте результаты в файл.
     */
    public static void main(String[] args) {
//        try (FileInputStream fis = new FileInputStream("taski.txt");
//             Scanner scanner = new Scanner(fis);
//             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("authorAveragePrice.ser"))) {
//
//            Map<String, Double> authorAveragePrice = scanner.useDelimiter("\\A").next().lines()
//                    .skip(1)
//                    .map(line -> line.split(", "))
//
    }
}
