package _2024_02_12;//package PROF.dryKissYagni;
//
//import java.util.List;
//
//public class DA { //имя класса не говорит ни о чем

//    // Нарушение DRY: Дублирование кода
//    public void processData(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size(); если переменная нужна лишь для вывода в консоль можно обойтись и без нее
//        System.out.println("Average: " + average);

//        System.out.println("Average: " + (sum / data.size())); так
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //totalAge += user.getAge();
//        }
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}

/***********/

//public int dataSum(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        return sum;
//    }

//public double getAverage(List<Integer> data) {
//       int sum = dataSum(data);
//       double average = (double) sum /
//       return average;
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = dataSum(users);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}
//
