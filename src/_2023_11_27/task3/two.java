package _2023_11_27.task3;

import java.util.LinkedList;
import java.util.List;

public class two {
    public static void main(String[] args) {
        //- Разработать метод, который создает List, содержащий первые уникальные элементы исходного List до первого повторения.

        List<Integer> List = new LinkedList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(3);
        List.add(4);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);

        System.out.println("Лист до: " + List);
        System.out.println("Лист после: " + uniqueList(List));
    }

    public static List<Integer> uniqueList(List<Integer> strList) {
        List<Integer> List2 = new LinkedList<>();

        for (Integer num : strList) {
            if (List2.contains(num)) {
                break;
            } else {
                List2.add(num);
            }
        }
        return List2;
    }
}

