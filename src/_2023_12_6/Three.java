package _2023_12_6;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Three {
    public static void main(String[] args) {
        //3**Создайте класс User с полями name и age, реализующий Comparable
        //для сортировки по возрасту. Используйте TreeMap<User, String>
        //для хранения информации о пользователях и переберите его, чтобы напечатать имена.

        Map<User, String> userStringMap = new TreeMap<>();
        User user1 = new User("Urmat", 26);
        User user2 = new User("Edgar", 61);
        User user3 = new User("Krista", 84);

        userStringMap.put(user1, "Bolotbekov");
        userStringMap.put(user2, "Scmidt");
        userStringMap.put(user3, "Mueller");
        System.out.println(userStringMap);

        System.out.print("Names: ");
        for (User human : userStringMap.keySet()) {
            System.out.print(human.getName() + " ");
        }

    }
    public static class User implements Comparable {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }


        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }

}
