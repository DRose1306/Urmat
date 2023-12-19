package _2023_12_18.Task1;

import java.util.Arrays;

public class Task10 {
    //Создайте функциональный интерфейс ArrayRotator с методом rotate, который выполняет циклический сдвиг элементов массива.
    //Напишите метод, который принимает массив и ArrayRotator и шаг сдвига, и выполняет сдвиг массива на заданную позицию влево.

    public static void main(String[] args) {
        int k = 3;
        int[] newArray = arrayElemensShift(new int[]{1, 2, 3, 4, 5}, k, array -> {
            int count = k % array.length;

            for (int i = 0; i < count; i++) {
                int temp = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = temp;
            }
            return array;
        });
        System.out.println("new Array: " + Arrays.toString(newArray));
    }

    static int[] arrayElemensShift(int[] array, int k, ArrayRotator arrayRotator) {
        return arrayRotator.rotate(array);
    }
}

@FunctionalInterface
interface ArrayRotator {
    int[] rotate(int[] array);
}
