package _2023_11_20;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {

        // Инвертировать массив, то есть изменить порядок элементов в массиве на обратный.
        //Поиск третьего по величине числа в массиве

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // самый банальный массив, не требующий сортировки

        int[] reverceArr = reverceArray(array); // в новый массив записываем результат выполнения метода
        System.out.println(Arrays.toString(reverceArr)); // и выводим это в консоль

        //закомментированный ниже код написан по приколу в процессе обдумвания
        /*String array2 = Arrays.toString(array);
        System.out.println(array2);
        StringBuilder sB = new StringBuilder(array2);
        sB.reverse();
        String array3 = sB.toString();
        System.out.println(array3);*/

        int thirdMax = findThirdMax(array); // вызываем метод и его резьтат записываем в новую переменную
        System.out.println("третье по величине число ровно: " + thirdMax); //выводим в консоль
    }

    public static int[] reverceArray(int[] array) { //метод который инвертирует
        int current = 0;
        for (int i = 0; i < array.length / 2; i++) {
            current = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = current;
        }
        return array;
    }

    public static int findThirdMax(int[] array) { // метод для поиска 3 макс. значения
        int maxNumber = 0;
        int secondMax = 0;
        int thirdMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                thirdMax = secondMax;
                secondMax = maxNumber;
                maxNumber = array[i];

            } else if (array[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = array[i];

            }else if (array[i] > thirdMax)
                thirdMax = array[i];
        }
        return thirdMax;
    }
}
