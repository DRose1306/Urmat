package _2023_11_27.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class four {
    public static void main(String[] args) {
        //Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("старый массив : ");
        System.out.println(Arrays.toString(array));
        System.out.print("новый массив : ");
        int[] array2 = arrayReverce(array);
        System.out.println(Arrays.toString(array2));
        System.out.println();

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num1.add(6);
        num1.add(7);
        num1.add(8);
        num1.add(9);
        num1.add(10);
        System.out.println("второй метод");
        System.out.println("первый лист");
        System.out.println(num1);
        System.out.println("второй лист");
        System.out.println(listReverse(num1));


    }

    public static int[] arrayReverce(int[] array) {
        int[] arrayReverce = new int[countArrayLenght(array)];
        arrayReverce[0] = array[array.length - 1];
        int index = 1;
        for (int i = array.length - 2; i >= 0; i--) {
            arrayReverce[index] = array[i];
            index++;
        }
        return arrayReverce;
    }

    public static int countArrayLenght(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> listReverse(ArrayList<Integer> list) {

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        return list2;
    }
}
