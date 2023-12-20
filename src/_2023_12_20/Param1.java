package _2023_12_20;

import java.util.LinkedList;
import java.util.List;

public class Param1 {
    public static void main(String[] args) {

        List list = new LinkedList();
        list.add("88");
        list.add(11);
        list.add('o');

        String s =(String) list.get(0);

        List<Integer> list1 = new LinkedList<>();
        list1.add(5);
        int y = list1.get(0);
        /**
         *  int y = (Integer) list1.get(0);
         */
    }
}