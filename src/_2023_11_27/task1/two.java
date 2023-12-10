package _2023_11_27.task1;

import java.util.ArrayList;

public class two {
    public static void main(String[] args) {
        /*** 2 ***/
        System.out.println("Второе задание");
        //- Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
        System.out.println("первый метод");
        int[] array = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10};
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
        countNum2(num1);
    }

    /*** 2 ***/
    public static void countNum(int[] array) {
        int max = getMaxValue(array);
        int[] array2 = new int[max + 1];
        for (int num : array) {
            array2[num]++;
        }
        for (int i = 0; i < array2.length; i++) {
            if (array[i] > 0) {
                System.out.println("Число " + i + " встречается " + array2[i] + " раз(а).");
            }
        }
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
        for (Integer integer : num2) {
            int count = 0;
            for (Integer value : num1) {
                if (integer.equals(value)) {
                    count++;
                }
            }
            System.out.println("Число " + integer + " встречается: " + count);
        }
    }
}
