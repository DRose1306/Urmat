package _2023_12_4;

import java.util.HashMap;
import java.util.Map;

public class One {
    public static void main(String[] args) {
        //HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.

        Map<String, String> map = new HashMap<>();
        map.put("aaaa", "AAAA");
        map.put("ccc", "CCCCC");
        map.put("bbbb", "BBBBB");
        map.put("ddddd", "DDDDD");
        map.put("e", "EEEEE");
        map.put("ff", "FFFF");
        map.put("bbbbbbbb", "BBBBB");

        System.out.println("количество пар ключ-значение равна : " + findCount(map));
    }
    public static int findCount(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == value.length()) {
                count++;

            }
        }
        return count;
    }
}
