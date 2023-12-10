package _2023_11_27.task2;

import java.util.LinkedList;
import java.util.List;

public class two {
    public static void main(String[] args) {
        //Составить метод, который объединяет все строки из List в одну большую строку.

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
        for (String str : list){
            sB.append(str);
        }
        return sB.toString();
    }
}
