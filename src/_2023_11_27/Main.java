package _2023_11_27;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.

        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10};
        int x = 15;
        countNum(arr);


        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);
        //System.out.println(num);

    }

    public static void countNum(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                //continue;
            }
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    temp++;
                }
            }
            System.out.println("Число - " + arr[i] + " встречается " + temp + " раз.");
            temp = 0;
        }
    }
}
