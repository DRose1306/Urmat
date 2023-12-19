package _2023_12_18.Task1;

import java.util.Optional;

public class Task3 {
    //Создайте функциональный интерфейс SafeDivision с методом divide, который безопасно делит два числа и возвращает Optional<Double>.
    //Реализуйте метод, который делит два числа с использованием SafeDivision, обрабатывая случай деления на ноль.
    public static void main(String[] args) {
        System.out.println(division(7, 2, (a, b) -> Optional.of((double) a / b)));

        //SafeDivision safeDivide = (a, b) -> b == 0 ? Optional.empty() : Optional.of((double) (a / b));
        //System.out.println("Результат: " + safeDivide.divide(7, 2).orElse(Double.NaN));
    }

    static Optional<Double> division(int a, int b, SafeDivision safeDivision) {
        if (b == 0) {
            System.out.println("Деление на ноль невозможно");
        }
        return safeDivision.divide(a, b);
    }
}

@FunctionalInterface
interface SafeDivision {
    Optional<Double> divide(int a, int b);
}

