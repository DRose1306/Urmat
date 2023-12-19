package _2023_12_18.Task1;

import java.util.Arrays;

public class Task6 {
    //Создайте функциональный интерфейс ArrayTransformer с методом transform, который принимает массив
    //целых чисел и выполняет операцию возведения каждого элемента в квадрат.
    //Напишите метод, который принимает массив и ArrayTransformer, и изменяет массив, возведя каждый его элемент в квадрат.

    public static void main(String[] args) {
        int[] newArray = arrayPow(new int[]{1, 2, 3, 4}, array -> { //за час работы над этой задачей мне не удалось получить более компактную запись
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * array[i];
            }
            return array;
        });
        System.out.println(Arrays.toString(newArray));
    }

    static int[] arrayPow(int[] array, ArrayTransformer arrayTransformer) {
       return arrayTransformer.transform(array);
    }
}

@FunctionalInterface
interface ArrayTransformer {
    int[] transform(int[] array);
}