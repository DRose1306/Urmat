package _2023_11_20.two.library;

import java.util.Scanner;

public class Reader {
    //Читатель (Reader)
    //        Поля: имя, возраст, список взятых книг (массив).
    //                Методы: взять книгу, вернуть книгу.
    private String name;
    private int age;
    private String[] listOFBooks;

    public static void getBook(String book) {
        System.out.println("Читатель получил книгу " + book);
    }

    public static void returnBook(String[] listOFBooks) {
        System.out.println("Введите название возвращаемой книги");

        String returnedBook = new Scanner(System.in).nextLine();
        System.out.println("Читатель возвращает книгу " + returnedBook);

        System.out.println("Выносим книгу из списка взятых книг");

        for (String book : listOFBooks) {
            if (returnedBook.equals(book)) {
            book = null;
            }else System.out.println("Данная книга не взята с библеотеки");
        }
    }
}
