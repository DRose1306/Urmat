package _2023_12_4;

import java.util.*;

public class Seven {
    public static void main(String[] args) {
        //        //HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>,
        //        где каждый ключ - это ключ из исходного HashMap, а значение - общее количество символов
        //        во всех строках списка этого ключа.
        Map<Integer, List<String>> integerListMap = new HashMap<>();
        integerListMap.put(1, new ArrayList<>(Arrays.asList("a", "bb", "ccc")));
        integerListMap.put(2, new ArrayList<>(Arrays.asList("dd", "eee", "ffff")));
        integerListMap.put(3, new ArrayList<>(Arrays.asList("ggggg", "hhhhhh", "kk")));
        System.out.println("old Map : " + integerListMap);
        System.out.println("new Map : " + listToInt(integerListMap));
    }
    public static Map<Integer, Integer> listToInt(Map<Integer, List<String>> integerListMap){
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (Map.Entry<Integer, List<String>> element : integerListMap.entrySet()){
            integerMap.put(element.getKey(), getListLenght(element.getValue()));
        }
        return integerMap;
    }
    public static int getListLenght(List<String> list){
        int sum = 0;
        for (String str : list) {
            sum += str.length();
        }
        return sum;
    }
}
