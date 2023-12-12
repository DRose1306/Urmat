package _2023_12_6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Eight {
    public static void main(String[] args) {
        //**Создайте TreeMap<String, Integer> и переберите его, создавая HashMap<Integer, String>, включающий только те записи, где значение больше 50.

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("aa", 100);
        treeMap.put("bb", 49);
        treeMap.put("cc", 35);
        treeMap.put("dd", 63);
        treeMap.put("ee", 78);
        treeMap.put("ff", 56);

        System.out.println("Tree Map: " + treeMap);
        System.out.println();
        System.out.println("Hash Map: " + treeToHash(treeMap));
    }
    public static HashMap<Integer, String> treeToHash(TreeMap<String, Integer> treeMap){
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (Map.Entry<String, Integer> element : treeMap.entrySet()){
            if (element.getValue() > 50){
                hashMap.put(element.getValue(), element.getKey());
            }
        }
        return  hashMap;
    }
}
