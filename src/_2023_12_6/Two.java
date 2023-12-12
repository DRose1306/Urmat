package _2023_12_6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Two {
    public static void main(String[] args) {
        //***Создайте HashMap<Integer, String>, представляющий
        //"ID-имя пользователя". Используйте цикл для фильтрации
        //пользователей с ID больше 100 и копируйте их в TreeMap.

        Map<Integer, String> treeMap = new HashMap<>();
        treeMap.put(50, "Alex");
        treeMap.put(102, "Slava");
        treeMap.put(99, "Jake");
        treeMap.put(105, "Jon");
        treeMap.put(43, "Tayler");
        treeMap.put(40, " Bled");
        System.out.println("old Map: " + treeMap);
        System.out.println("new Map: " + filterMap(treeMap));
    }
    public static Map<Integer, String> filterMap(Map<Integer, String> treeMap) {
        Map<Integer, String> newMap = new TreeMap<>();
        for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
            if (e.getKey() > 100) {
                newMap.put(e.getKey(), e.getValue());
            }
        }
        return newMap;
    }
}
