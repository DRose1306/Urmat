package _2023_12_13;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {
        //- Инвертируйте Map<String, String>, чтобы ключи стали значениями, а значения ключами.
        //  public static Map<String, String> invert(Map<String, String> map)
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        System.out.println("Old Map: " + map);
        System.out.println("New Map: " + invert(map));

    }
    public static Map<String, String> invert(Map<String, String> map){
        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String,String> element : map.entrySet()){
            newMap.put(element.getValue(), element.getKey());
        }
        return newMap;
    }
}
