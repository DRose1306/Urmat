package _2023_11_27.task3;

import java.util.LinkedList;
import java.util.List;

public class Three {
    public static void main(String[] args) {
        //Разработать метод, который объединяет строки из List в одну строку, разделяя их запятой
        List<String> strList = new LinkedList<>();
        strList.add("1");
        strList.add("2");
        strList.add("3");
        strList.add("4");
        strList.add("5");
        System.out.println("Лист до конкатенации : " + strList);
        System.out.print("Лист после конкатенации : ");
        System.out.println(strConcatenate(strList));
    }

    public static String strConcatenate(List<String> list) {
        StringBuilder sB = new StringBuilder();
        for (String str : list) {
            sB.append(str).append(",");
        }
        return sB.toString();
    }
}

