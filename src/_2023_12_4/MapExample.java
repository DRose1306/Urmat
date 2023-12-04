package _2023_12_4;

import java.util.Map;
import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        //HashMap<String, String>: Найдите количество пар ключ-значение, где длина ключа равна длине значения.
        //
        //HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.
        //
        //HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с гласной буквы.
        //
        //HashMap<Integer, Integer>: Найдите ключ с максимальным значением и выведите эту пару.
        //
        //HashMap<String, String>: Определите, содержит ли HashMap такую пару ключ-значение, где ключ является обратной строкой значения (например, ключ "abc", значение "cba").
        //
        //HashMap<String, Integer>: Переберите HashMap и преобразуйте его в HashMap<String, String>, где каждое значение - это строковое представление исходного числа, умноженного на 2.
        //
        //HashMap<Integer, List<String>>: Создайте второй HashMap<Integer, Integer>, где каждый ключ - это ключ из исходного HashMap, а значение - общее количество символов во всех строках списка этого ключа.
        //
        //HashMap<Integer, Integer>: Найдите все пары ключ-значение, где ключ минус значение является простым числом.
        //
        //HashMap<String, String>: Определите, можно ли преобразовать HashMap в List<String>, где каждый элемент - это конкатенация ключа и значения, так, чтобы все элементы списка были уникальными.
        //
        //HashMap<String, Integer> и HashMap<Integer, List<String>>: Для каждого ключа в HashMap<String, Integer> найдите соответствующие строки в HashMap<Integer, List<String>>, где ключ во втором HashMap - это значение из первого, и выведите их.

        Map<String, String> map = new HashMap<>();
        map.put("aaaa", "AAAAA");
        map.put("ccc", "CCCCC");
        map.put("bbbb", "BBBBB");
        map.put("ddddd", "DDDDD");
        map.put("e", "EEEEE");
        map.put("ff", "FFFF");
        map.put("bbbbbbbb", "BBBBB");

        Map<String, Integer> mapSI = new HashMap<>();
        mapSI.put("Ab", 1);
        mapSI.put("B", 2);
        mapSI.put("Ac", 3);
        mapSI.put("D", 4);
        mapSI.put("Ad", 5);
        mapSI.put("E", 6);
        int sum = countSum(mapSI);
        System.out.println("Cуммa всех значений " + sum);

        Map<Integer, String> mapIS = new HashMap<>();
        mapIS.put(1, "a");
        mapIS.put(2, "b");
        mapIS.put(3, "e");
        mapIS.put(4, "d");
        mapIS.put(5, "e");
        mapIS.put(6, "i");
        mapIS.put(7, "o");
        mapIS.put(8, "u");
        mapIS.put(9, "c");
    //"aeiou"

    }

    public static void findCount(Map<String, String> map) {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.length() == value.length()) {
                count++;

            }
        }
        System.out.println("Найдите количество пар ключ-значение, где длина ключа равна длине значения: " + count);
    }

    public static int countSum(Map<String, Integer> map) {
        ////HashMap<String, Integer>: Подсчитайте сумму всех значений, соответствующих ключам, начинающимся на букву 'A'.
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            //int value = entry.getValue();
            if (key.startsWith("A")) {
                sum += entry.getValue();
            }
        }
        return sum;
    }

    public static void valueOutput(Map<Integer, String> map) {
        ////HashMap<Integer, List<String>>: Для каждого ключа выведите все строки из соответствующего списка, которые начинаются с гласной буквы.

    }
}
