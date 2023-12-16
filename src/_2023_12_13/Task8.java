package _2023_12_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        //- Написать функцию, которая выполняет факторизацию(погуглить) числа и возвращает
        //  ее в виде Map, где ключ - это простой множитель, а значение - степень этого множителя.

        System.out.println("Введите число для разложения");
        int number = new Scanner(System.in).nextInt();
        Map<Integer, Integer> map = primeFactorization(number);
        System.out.println(map);
    }

    public static Map<Integer, Integer> primeFactorization(int number) {
        Map<Integer, Integer> map = new HashMap<>();
        int divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                map.put(divisor, map.getOrDefault(divisor, 0) + 1);
                number /= divisor;
            } else {
                divisor++;
            }
        }

        return map;
    }
}

