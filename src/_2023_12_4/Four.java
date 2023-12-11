package _2023_12_4;

import java.util.HashMap;
import java.util.Map;

public class Four {
    public static void main(String[] args) {
        //HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put(1,3);
        integerHashMap.put(2,4);
        integerHashMap.put(5,7);
        integerHashMap.put(6,8);
        searchMaxValue(integerHashMap);

    }
    public static void searchMaxValue(HashMap<Integer, Integer> integerHashMap){
        int value = Integer.MIN_VALUE;
        int key = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> element : integerHashMap.entrySet()){
            if (element.getValue() > value){
                value = element.getValue();
                key = element.getKey();
            }
        }
        System.out.println("Намбольшее значение : " + value + ", ключа: " + key);
    }
}
