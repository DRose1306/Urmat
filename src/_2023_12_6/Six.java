package _2023_12_6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Six {
    public static void main(String[] args) {
        //**Создайте HashMap<Integer, String> и перепишите его в TreeMap<String, Integer>,инвертируя ключи и значения.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "aa");
        map.put(2, "bb");
        map.put(3, "cc");
        map.put(4, "dd");
        System.out.println("Hash Map: " + map);
        System.out.println();
        System.out.println("Tree MAp: " + mapInvert(map));
    }
    public static TreeMap<String, Integer> mapInvert(HashMap<Integer, String> map){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> element : map.entrySet()){
            treeMap.put(element.getValue(), element.getKey());
        }
        return  treeMap;
    }
}
