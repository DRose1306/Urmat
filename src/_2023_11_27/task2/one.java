package _2023_11_27.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        // Реализовать метод, который удаляет все вхождения заданной строки из List<String>.

        List<String> strList = new LinkedList<>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");

        System.out.println("Введите строку для удаления");
        String str = new Scanner(System.in).nextLine();
        System.out.println("старый лист : " + strList);
        System.out.println("новый лист : " + strRemove(strList, str));

    }

    public static List<String> strRemove(List<String> list, String str) {
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i).equals(str)) {
                list.remove(i);
            }
        }
        return list;
    }
}
