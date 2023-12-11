package _2023_12_4;

import java.util.HashMap;
import java.util.Map;

public class Two {
    public static void main(String[] args) {
        //HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.

        Map<String, Integer> mapSI = new HashMap<>();
        mapSI.put("Ab", 1);
        mapSI.put("B", 2);
        mapSI.put("Ac", 3);
        mapSI.put("D", 4);
        mapSI.put("Ad", 5);
        mapSI.put("E", 6);
        int sum = countSum(mapSI);
        System.out.println("Cуммa всех значений " + sum);
    }

    public static int countSum(Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("A")) {
                sum += entry.getValue();
            }
        }
        return sum;
    }
}
