package _2023_11_27.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        //Реализовать метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа символов.

        List<String> strList = new LinkedList<>();
        strList.add("1");
        strList.add("2");
        strList.add("333");
        strList.add("4444");
        strList.add("55555");

        System.out.println("введите число");
        int userStr = new Scanner(System.in).nextInt();
        System.out.println("Лист до: " + strList);
        System.out.println("Лист после: " + deleteByLength(strList, userStr));
    }

    public static List<String> deleteByLength(List<String> list, int length) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < length){
                list.remove(i);
                i--;
            }
        }

        return list;
    }
}
