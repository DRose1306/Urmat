package _2023_12_18.Task1;

public class Task1 {
    //Создайте функциональный интерфейс StringLength с методом getLength, который принимает строку и возвращает её длину.
    //Напишите метод, который принимает строку и StringLength интерфейс и выводит длину строки.

    public static void main(String[] args) {
        getlenght(String::length, "Java");
    }

    static void getlenght(StringLength stringLength, String str) {
        System.out.println(stringLength.getLength(str));
    }
}

@FunctionalInterface
interface StringLength {
    int getLength(String s);
}


