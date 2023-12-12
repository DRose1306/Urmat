package _2023_11_20.two.library;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    //Библиотека (Library)
    //        Поля: название, адрес, список библиотекарей (массив).
    //                Методы: добавить библиотекаря, найти библиотекаря по имени.
    private String name;
    private String address;
    private String[] listOflibrarians;

    public static void addLibrarian(String[] listOflibrarians) {
        System.out.println("Введите имя нового библеотекаря");

        String newLibrarian = new Scanner(System.in).nextLine();
        System.out.println("Имя нового библеотекаря " + newLibrarian);

        System.out.println("Добавляем нового библеотекаря");

        String[] newlistOflibrarians = new String[listOflibrarians.length + 1];
        for (int i = 0; i < listOflibrarians.length; i++) {
            newlistOflibrarians[i] = listOflibrarians[i];
        }
        newlistOflibrarians[listOflibrarians.length] = newLibrarian;

        System.out.println("Книга в списке доступных");
        System.out.println(Arrays.toString(newlistOflibrarians));
    }

    public static void searchForLibrarian(String librarian, String[] listOflibrarians) {
        for (String name : listOflibrarians) {
            if (librarian.equals(name)) {
                System.out.println("Библеотекарь по имени " + librarian + " найден");
            } else System.out.println("данное имя отсутствует в списке");
        }
    }
}
