package _2023_11_27.task2;

import java.util.LinkedList;
import java.util.List;

public class five {
    public static void main(String[] args) {
        //Разработать метод, который возвращает новый List, содержащий только уникальные элементы из исходного списка строк
        List<String> strList = new LinkedList<>();
        strList.add("1");
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("4");
        strList.add("5");
        strList.add("6");
        strList.add("7");

        System.out.println("Лист до: " + strList);
        System.out.println("Лист после: " + uniqueList(strList));
    }

    public static List<String> uniqueList(List<String> strList) {
        List<String> strList2 = new LinkedList<>();
        for (String word: strList) {
            if(!strList2.contains(word)) {
                strList2.add(word);
            }
        }
        return strList2;
        }
    }

