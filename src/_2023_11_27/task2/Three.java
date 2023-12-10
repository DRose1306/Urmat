package _2023_11_27.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        //Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.

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

        System.out.println("введите число");
        int userStr = new Scanner(System.in).nextInt();
        ArrayList<Integer> num2 = createNewList(num1, userStr);
        System.out.println("старый лист : " + num1);
        System.out.println("новый лист : " + num2);
    }
    public static ArrayList<Integer> createNewList(ArrayList<Integer> num1, int userInt){
        ArrayList<Integer> num2 = new ArrayList<>();
        for (int i = 0; i <= num1.size() - 1; i++) {
            if (num1.get(i) > userInt){
                num2.add(num1.get(i));
            }
        }
        return num2;
    }
}
