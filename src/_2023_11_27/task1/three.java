package _2023_11_27.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        //- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.
        System.out.println("первый метод");
        int[] array = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10};
        System.out.println("cтарый массив " + Arrays.toString(array));
        countNum(array);
        System.out.println();

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(1);
        num1.add(2);
        num1.add(2);
        num1.add(2);
        num1.add(3);
        num1.add(3);
        num1.add(3);
        num1.add(3);
        num1.add(4);
        num1.add(4);
        num1.add(5);
        num1.add(6);
        num1.add(7);
        num1.add(7);
        num1.add(7);
        num1.add(8);
        num1.add(8);
        num1.add(8);
        num1.add(8);
        num1.add(8);
        num1.add(9);
        num1.add(9);
        num1.add(10);
        num1.add(10);
        System.out.println();
        System.out.println("второй метод");
        System.out.println("старый лист : " + num1);
        countNum2(num1);
    }

    public static void countNum(int[] array) {
        int lenght = getMaxValue(array);
        int[] array2 = new int[lenght];
        array2[0] = array[0];
        int index = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                array2[index] = array[i + 1];
                index++;
            }
        }

        System.out.println("новый массив : " + Arrays.toString(array2));

    }

    private static int getMaxValue(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void countNum2(ArrayList<Integer> num1) {

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(num1.get(0));
        for (int i = 0; i < num1.size() - 1; i++) {
            if (num1.get(i) != num1.get(i + 1)) {
                num2.add(num1.get(i + 1));
            }
        }
            System.out.println("новый лист : " + num2);
    }
}
