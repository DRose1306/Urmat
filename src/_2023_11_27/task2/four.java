package _2023_11_27.task2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class four {
    public static void main(String[] args) {
        //Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.
        List<String> strList = new LinkedList<>();
        strList.add("1");
        strList.add("22");
        strList.add("333");
        strList.add("4444");
        strList.add("55555");
        System.out.println("Лист String : " + strList);
        System.out.println("Лист Integer : " + stringToInteger(strList));
    }
    public static List<Integer> stringToInteger(List<String> strList){
        List<Integer> intList = new LinkedList<>();
        for (String str : strList){
            intList.add(str.length());
        }
        return intList;
    }
}
