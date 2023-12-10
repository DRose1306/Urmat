package _2023_11_27.task4;

import java.util.LinkedList;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        //- Написать метод, который возвращает список строк, которые встречаются в исходном списке более заданного количества раз.
        List<String> stringList = new LinkedList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("1");
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("5");
        stringList.add("5");
        System.out.println("старый лист : " + stringList);
        System.out.println( "новый лист : " + repeatString(stringList, 2));
    }

    public static List<String> repeatString(List<String> stringList, int countUp) {
        List<String> newList = new LinkedList<>();
        for (int i = 0; i < stringList.size() - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < stringList.size(); j++) {
                if (stringList.get(i).equals(stringList.get(j))) {
                    count++;
                }
            }
            if (count > countUp & !newList.contains(stringList.get(i))) {
                newList.add(stringList.get(i));
            }
        }
        return newList;
    }
}
