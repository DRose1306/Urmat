package _2023_11_20.two.library;

import java.util.Arrays;
import java.util.Scanner;

public class Librarian {
    // Библиотекарь (Librarian)
    //        Поля: имя, стаж работы, список доступных книг (массив).
    //                Методы: выдать книгу читателю, принять книгу от читателя.

    private String name;
    private double workExperience;
    private final String[] listOFBooks = {"Автостопом по галактике", "Маленький принц", "Заводной апельсин", "Остров доктора Моро"};

    public static void issuance(String book, String[] listOFBooks) {
        for (String available : listOFBooks) {
            if (book.equals(available)) {
                System.out.println("книга " + book + " выдана читателю");
            } else System.out.println("данная книга отсутствует в списке доступных");
        }
    }

    public static void obtaining(String[] listOFBooks) {
        System.out.println("Введите название возвращаемой книги");

        String returnedBook = new Scanner(System.in).nextLine();
        System.out.println("Читатель возвращает книгу " + returnedBook);

        System.out.println("Заносим книгу в список доступных");

        String[] newlistofBooks = new String[listOFBooks.length + 1];
        System.arraycopy(listOFBooks, 0, newlistofBooks, 0, listOFBooks.length);
        newlistofBooks[listOFBooks.length] = returnedBook;

        System.out.println("Книга в списке доступных");
        System.out.println(Arrays.toString(newlistofBooks));
    }

    //немного другой вариант метода
    //public static void obtaining(String book, String[] listOFBooks){
    //
    //        System.out.println("Читатель возвращает книгу " + book);
    //
    //        System.out.println("Заносим книгу в список доступных");
    //
    //        String[] newlistofBooks = new String[listOFBooks.length + 1];
    //        for (int i = 0; i < listOFBooks.length; i++) {
    //            newlistofBooks[i] = listOFBooks[i];
    //        }
    //        newlistofBooks[listOFBooks.length] = book;
    //
    //        System.out.println("Книга в списке доступных");
    //        System.out.println(Arrays.toString(newlistofBooks));
    //    }
}
