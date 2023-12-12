package _2023_11_20.two;

import _2023_11_20.two.library.Book;
import _2023_11_20.two.library.Librarian;
import _2023_11_20.two.library.Reader;

public class Main {
    public static void main(String[] args) {
        Book.infoOut("aaa", "Pushkin", 1820);
        Book.antiquityCheck(1820, 2023);

        Librarian.issuance("Остров доктора Моро", new String[]{"Автостопом по галактике", "Маленький принц", "Заводной апельсин", "Остров доктора Моро"});
        Librarian.obtaining(new String[]{"Автостопом по галактике", "Маленький принц", "Заводной апельсин", "Остров доктора Моро"});

        Reader.getBook("Богатый папа, бедный папа");
        //Reader.returnBook(); хотел съэкономить время на создании массива

        //Library.addLibrarian(); хотел съэкономить время на создании массива
        //Library.searchForLibrarian(); хотел съэкономить время на создании массива


        //ничего дальше тут нет в целях экономии времени
    }
}