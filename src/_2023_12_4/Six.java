package _2023_12_4;

import java.util.HashMap;
import java.util.Map;

public class Six {
    public static void main(String[] args) {
        //HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>, где каждое значение - это строковое представление исходного числа, умноженного на 2.
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("1", 1);
        stringIntegerMap.put("2", 2);
        stringIntegerMap.put("3", 3);
        stringIntegerMap.put("4", 4);
        System.out.println("old Map : " + stringIntegerMap);
        System.out.println("new Map : " + intToString(stringIntegerMap));
    }
    public static Map<String, String> intToString(Map<String, Integer> stringIntegerMap){
        Map<String, String> stringMap = new HashMap<>();
        for (Map.Entry<String, Integer> element : stringIntegerMap.entrySet()){
            stringMap.put(element.getKey(), String.valueOf(element.getValue() * 2));
        }
        return stringMap;
    }
}
