package _2023_12_18.Task1;

public class Task5 {
    //Создайте функциональный интерфейс Logger с методом log, который принимает строку и выводит её в консоль.
    //Напишите метод, который использует Logger для логирования различных сообщений.
    public static void main(String[] args) {
        strOutput("Hello", str -> System.out.println(str));
    }

    static void strOutput(String str, Logger logger) {
        logger.log(str);
    }
}

@FunctionalInterface
interface Logger {
    void log(String str);
}
