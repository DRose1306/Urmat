package _2023_12_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Seven {
    public static void main(String[] args) {
        //**Создайте HashMap<String, Integer>, переберите её и создайте List<Integer>, содержащий все значения HashMap.
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aa", 1);
        map.put("bb", 2);
        map.put("cc", 3);
        map.put("dd", 4);
        System.out.println("Map: " + map);
        System.out.println("List: " + mapValueToList(map));
    }
    public static List<Integer> mapValueToList(HashMap<String, Integer> map){
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> element : map.entrySet()){
            list.add(element.getValue());
        }
        return list;
    }
}
