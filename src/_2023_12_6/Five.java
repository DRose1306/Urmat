package _2023_12_6;
import _2023_12_6.Three.User;

import java.util.Map;
import java.util.TreeMap;

public class Five {
    public static void main(String[] args) {
        //**Создайте два HashMap<String, User> (класс User как в задаче 3) и объедините их в один, удалив дубликаты пользователей.
        Map<User, String> userStringMap = new TreeMap<>();
        User user1 = new User("Urmat", 26);
        User user2 = new User("Edgar", 61);
        User user3 = new User("Krista", 84);
        User user4 = new User("Kamila", 22);

        userStringMap.put(user3, "Mueller");
        userStringMap.put(user1, "Bolotbekov");
        userStringMap.put(user2, "Scmidt");
        userStringMap.put(user4, "Siyarova");
        System.out.println("Map1: " + userStringMap);
        System.out.println();

        Map<User, String> userStringMap2 = new TreeMap<>();
        User user5 = new User("Urmat", 26);
        User user6 = new User("Silvia", 58);
        User user7 = new User("Neumann", 60);
        User user8 = new User("Kamila", 22);

        userStringMap2.put(user5, "Bolotbekov");
        userStringMap2.put(user6, "Scmidt");
        userStringMap2.put(user7, "Schreder");
        userStringMap2.put(user8, "Siyarova");
        System.out.println("Map2: " + userStringMap2);
        System.out.println();

        Map<User, String> newMap = mapMerge(userStringMap, userStringMap2);
        for (Map.Entry<User, String> element : userStringMap.entrySet()) {
            System.out.print(element.getKey() + " " + element.getValue() + " , ");
        }




    }
    public static Map<User, String>  mapMerge(Map<User, String> userStringMap, Map<User, String> userStringMap2){
        //Map<User, String> result = new TreeMap<>();

       // for (Map.Entry<User, String> user1 : userStringMap.entrySet()){
            /*for (Map.Entry<User, String> user2 : userStringMap2.entrySet()){
                if (user1.getClass().equals(user2.getClass())){
                    result.put(user1.getKey(), user1.getValue());
                }
                result.put(user1.getKey(), user1.getValue());
                result.put(user2.getKey(), user2.getValue());
            }
        }
        return result;
    }*/
            for(Map.Entry<User, String> entry : userStringMap2.entrySet()) {
                if(!userStringMap.containsKey(entry.getKey())) {
                    userStringMap.put(entry.getKey(), entry.getValue());
                }
            }

            return userStringMap;
        }
}
