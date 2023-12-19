package _2023_12_18.Task1;

public class Task2 {
    //Создайте функциональный интерфейс NumberOperation с методом operate, который принимает два целых числа и возвращает целое число.
    //Напишите методы для выполнения базовых арифметических операций (сложение, вычитание, умножение, деление) с использованием этого интерфейса.

    public static void main(String[] args) {
        System.out.println(operation(2, 3, Integer::sum));
        System.out.println(operation(5, 2, (a, b) -> a - b));
        System.out.println(operation(5, 2, (a, b) -> a * b));
        System.out.println(operation(5, 2, (a, b) -> a / b));

    }

    static Integer operation(int a, int b, NumberOperation numberOperation) {
        return numberOperation.operate(a, b);
    }


}

@FunctionalInterface
interface NumberOperation {
    int operate(int a, int b);
}
