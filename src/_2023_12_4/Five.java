package _2023_12_4;

import java.util.HashMap;
import java.util.Map;

public class Five {
    public static void main(String[] args) {
        //HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение, где ключ является обратной строкой значения (например, ключ "abc", значение "cba").
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("tik", "tak");
        stringMap.put("tik", "tok");
        stringMap.put("tuk", "tuk");
        stringMap.put("abc", "cba");
        stringMap.put("abcd", "dcba");
        isReverce(stringMap);
    }
    public static void isReverce(Map<String, String> stringMap){

        System.out.println("пара ключ-значение, где ключ является обратной строкой значения найдена : ");
        for (Map.Entry<String, String> element : stringMap.entrySet()){
            if (stringReverse(element.getKey()).equals(element.getValue())){

                System.out.println("Ключ - " + element.getKey() + " значение - " + element.getValue());

            }
        }
    }
    public static String stringReverse(String str){
        StringBuilder sB = new StringBuilder(str);
        sB.reverse();
        return sB.toString();
    }
}
