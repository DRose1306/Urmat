package _2023_12_11;

import java.util.*;

public class One {
    public static void main(String[] args) {
        String str = "asa";

        System.out.println(isPolindrome(str));

    }
    static boolean isPolindrome(String str){
        char[] arr = str.toCharArray();
        StringBuilder sB = new StringBuilder();

        List<Character> list = new ArrayList<>();
        for (char c : arr) {
            list.add(c);
        }

        ListIterator<Character> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            sB.append(iterator.previous());
        }
        return str.equals(sB.toString());
    }
}
