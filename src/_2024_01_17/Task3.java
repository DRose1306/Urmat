package _2024_01_17;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        //Напишите метод, который объединяет строки из списка объектов.
        List<Book> list = Arrays.asList(
                new Book("Физика", Arrays.asList("Ньютон", "Эйнштейн")),
                new Book("Букварь", Arrays.asList("Тётя", "Дядя")),
                new Book("Руководсво по сборке", Arrays.asList("Икея", "Дьявол"))
        );
        
        List<String> authors = getAuthorsTitles(list);
        System.out.println(authors);

    }

    static List<String> getAuthorsTitles(List<Book> books) {

        return books.stream()
                .flatMap(el -> el.getAuthors().stream())
                .toList();
    }
}

class Book {
    private String title;
    private List<String> authors;

    public Book(String title, List<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
