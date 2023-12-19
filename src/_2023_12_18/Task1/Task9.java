package _2023_12_18.Task1;

import java.util.Arrays;

public class Task9 {
    //Создайте функциональный интерфейс NumberProcessor с методом process, который выполняет операцию над массивом чисел.
    //Напишите метод, который принимает массив чисел и NumberProcessor, и возвращает массив после умножения каждого элемента на -1

    public static void main(String[] args) {
        int[] newArray = someMethodt(new int[]{1, 2, 3, 4, 5}, array -> {
            for (int i = 0; i < array.length; i++) {
                array[i] *= -1;
            }
            return array;
        });
        System.out.println(Arrays.toString(newArray));
    }

    static int[] someMethodt(int[] array, NumberProcessor numberProcessor) {
        return numberProcessor.process(array);
    }
}

@FunctionalInterface
interface NumberProcessor {
    int[] process(int[] array);
}
