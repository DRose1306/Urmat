package Algorithms;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {

        System.out.println(fiboBad(5));
        System.out.println(fiboGood(100));

        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fiboMem(n, mem));

    }

    //плохой метод с кореектировками позволяющими избежать повторного вычисления одних и тех же n, что ускорит скрость работы метода
    // за счет мемоизации
    //Мемоизация - это оптимизация в программировании, которая заключается в сохранении результатов выполнения дорогостоящих функций и использовании сохраненных результатов при повторном вызове функции с теми же входными данными. Это позволяет избежать повторного вычисления результата и ускоряет выполнение программы.
    //
    //Простым способом реализации мемоизации является использование таблицы (например, словаря) для хранения результатов выполнения функции для различных наборов входных данных. Если функция вызывается с уже ранее встречавшимися входными данными, то результат извлекается из таблицы, а не вычисляется заново.
    //
    //Мемоизация может быть полезной в случаях, когда функция имеет много повторных вызовов с одними и теми же аргументами, и повторное вычисление результата слишком затратно.
    //O(n)
    private static long fiboMem(int n, long[] mem) {
        if (mem[n] != -1) {
            return mem[n];
        }
        if (n <= 1) {
            return n;
        }
        long result = fiboMem(n - 1, mem) + fiboMem(n - 2, mem);
        mem[n] = result;
        return result;
    }


    //плохой и медленный метод O(2^n)
    private static long fiboBad(int n) {
        if (n <= 1) {
            return n;
        }
        return fiboBad(n - 1) + fiboBad(n - 2);
    }

    //хороший метод (быстрый) O(n)
    private static long fiboGood(int n) {
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }
}

