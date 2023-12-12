package _2023_12_6;

import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String[] args) {
        //**Создайте HashMap<String, Integer>, заполните его парами
        //"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.
        Map<String, Integer> map = new HashMap<>();
        map.put("Alex", 15);
        map.put("Slava", 18);
        map.put("Jake", 20);
        map.put("Jon", 25);
        map.put("Tayler", 30);
        map.put("Bled", 12);
        System.out.println("old map: " + map);
        System.out.println("new map: " + dobleAge(map));
    }
    public static Map<String, Integer> dobleAge(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            e.setValue(e.getValue() * 2);

        }
        return map;
    }
}
