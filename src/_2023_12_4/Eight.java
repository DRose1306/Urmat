package _2023_12_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Eight {
    public static void main(String[] args) {
        //HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.
        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(4, 2);
        integerMap.put(6, 3);
        integerMap.put(8, 4);
        integerMap.put(10, 5);
        integerMap.put(9, 3);
        searchPair(integerMap);

    }

    public static void searchPair(Map<Integer, Integer> integerMap) {
        System.out.println("пары где ключ минус значение значение являются простыми числами : ");
        for (Map.Entry<Integer, Integer> element : integerMap.entrySet()) {
            if (checkNumbers(element.getKey(), element.getValue())) {
                System.out.println("Ключ :" + element.getKey() + " значение : " + element.getValue());
            }
        }
    }

    public static boolean checkNumbers(int key, int value) {
        int num = key - value;
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
