package _2023_12_4;

import java.util.*;

public class Ten {
    public static void main(String[] args) {
        //HashMap<String, Integer> и HashMap<Integer, List<String>>:
        // Для каждого ключа в HashMap<String, Integer> найдите соответствующие строки
        // в HashMap<Integer, List<String>>, где ключ во втором HashMap - это значение из первого, и выведите их.

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("1", 1);
        map1.put("2", 2);
        map1.put("3", 3);
        map1.put("4", 4);

        Map<Integer, List<String>> map2 = new HashMap<>();
        map2.put(1, new ArrayList<>(Arrays.asList("1", "ss", "gf", "2")));
        map2.put(2, new ArrayList<>(Arrays.asList("3", "ss", "gf", "4")));
        map2.put(3, new ArrayList<>(Arrays.asList("1", "ss", "gf", "3")));
        map2.put(4, new ArrayList<>(Arrays.asList("4", "ss", "gf", "2")));
        findRelevantValue(map1, map2);
    }

    public static void findRelevantValue(Map<String, Integer> map1, Map<Integer, List<String>> map2) {
        for (Map.Entry<String, Integer> entry1 : map1.entrySet()) {
            for (Map.Entry<Integer, List<String>> entry2 : map2.entrySet()) {
                if (keyEqualsValue(entry1.getKey(), entry2.getValue())) {
                    System.out.print("MAP 1 KEY: " + entry1.getKey()  + " , ");
                    System.out.println("MAP 2 KEY: " + entry2.getKey() + " VALUE: " + entry2.getValue());
                }
            }
        }

    }

    public static boolean keyEqualsValue(String key, List<String> value) {
        for (String str : value) {
            if (key.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
