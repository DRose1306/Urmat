package _2023_12_4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Nine {
    public static void main(String[] args) {
        //HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>,
        // где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("3", "4");
        map.put("5", "6");
        map.put("7", "8");
        System.out.println("Map : " + map);
        System.out.println("List : " + convertToStr(map));
    }
    public static List<String> convertToStr(Map<String, String> map){
        List<String> stringList = new LinkedList<>();
        for (Map.Entry<String, String> element : map.entrySet()){
            stringList.add(concatenation(element.getKey(), element.getValue()));
        }
        return stringList;
    }
    public static String concatenation(String key, String value){
        StringBuilder sB = new StringBuilder();
        sB.append(key).append(value);
        return sB.toString();
    }
}
