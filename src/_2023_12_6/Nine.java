package _2023_12_6;

import java.util.*;

public class Nine {
    public static void main(String[] args) {
        //**Создайте HashMap<String, List<Integer>>, где ключ - это имя, а значение - список оценок.
        //Используйте TreeMap<Integer, List<String>> для создания отображения
        //"средняя оценка - список студентов с этой оценкой".

        HashMap<String, List<Integer>> stringListHashMap = new HashMap<>();
        stringListHashMap.put("Urmat", new ArrayList<>(Arrays.asList(5,5,5,5,5)));
        stringListHashMap.put("Kamila", new ArrayList<>(Arrays.asList(5,4,4,4,5)));
        stringListHashMap.put("Argen", new ArrayList<>(Arrays.asList(5,4,3,3,4)));
        stringListHashMap.put("Islam", new ArrayList<>(Arrays.asList(5,5,4,4,4)));
        stringListHashMap.put("Nurgazy", new ArrayList<>(Arrays.asList(5,4,4,3,4)));

        System.out.println("Old Map: " + stringListHashMap);
        System.out.println();
        System.out.println("New Map: " + studentsByMark(stringListHashMap));

    }
    public static int averageMark(List<Integer> marks) {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }

        return sum/marks.size();
    }
    public static TreeMap<Integer, List<String>> studentsByMark(Map<String, List<Integer>> map) {

        TreeMap<Integer, List<String>> treeMap = new TreeMap<>();

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<String> list = new ArrayList<>(map.keySet());
            treeMap.put(averageMark(entry.getValue()), list);
        }

        return treeMap;
    }
}
