package _2023_12_6;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import _2023_12_6.Three.User;

public class Four {
    public static void main(String[] args) {
        //**Создайте TreeMap<User, String> (класс User как в задаче 3), но на
        //этот раз реализуйте Comparator<User>, чтобы сортировать пользователей по имени.

        Map<User, String> userStringMap = new TreeMap<>();
        User user1 = new User("Urmat", 26);
        User user2 = new User("Edgar", 61);
        User user3 = new User("Krista", 84);
        User user4 = new User("Kamila", 22);

        userStringMap.put(user3, "Mueller");
        userStringMap.put(user1, "Bolotbekov");
        userStringMap.put(user2, "Scmidt");
        userStringMap.put(user4, "Siyarova");

        System.out.println(userStringMap);
    }

    public class NameComparator implements Comparator<User> {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
