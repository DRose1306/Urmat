package _2023_11_27.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class One {
    public static void main(String[] args) {
        //Создать метод, который вычисляет среднее значение, медиану и стандартное отклонение для списка целых чисел.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("среднее значение равно : " + avaregeValue(list));
        System.out.println("медиана ряда чисел равна : " + median(list));
        System.out.println("стандартное отклоннение ряда чисел равна : " + standartDeviation(list));
    }

    public static double avaregeValue(ArrayList<Integer> list) {
        double avaregeValue = 0;

        for (double value : list) {
            avaregeValue += value;
        }
        return (double) avaregeValue / list.size();
    }

    public static double median(ArrayList<Integer> list) {
        Collections.sort(list);
        if (list.size() % 2 != 0) {
            return list.get(list.size() / 2);
        } else {
            return (double) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        }
    }
    public static double standartDeviation(ArrayList<Integer> list) {
        double averageValue =  avaregeValue(list);
        double result = 0;
        for (Integer num : list){
            result += Math.pow((num - averageValue), 2);
        }
        return Math.sqrt(result / list.size());
    }
}