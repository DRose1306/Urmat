package _2023_11_27;

import java.util.ArrayList;

public class one {
    public class Main {
        public static void main(String[] args) {
            //- Дан массив/коллекция целых чисел и целое число X. Найти пару чисел в массиве/коллекции, сумма которых равна X.
            //- Дан массив/коллекция целых чисел. Необходимо подсчитать, сколько раз каждый элемент встречается в массив/коллекции.
            //- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.
            //- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.
            //Array/List

            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int x = 15;
            // findTwoNums(arr, x);
            // findTwoNums2(arr,x);
            findTwoNums3(arr,x);

            ArrayList<Integer> num = new ArrayList<>();
            num.add(1);
            num.add(2);
            num.add(3);
            num.add(4);
            num.add(5);
            num.add(6);
            num.add(7);
            num.add(8);
            num.add(9);
            num.add(10);
            System.out.println(num);
            findTwoNums4(num, x);


        }

        public static void findTwoNums(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == x) {
                        System.out.println("Пара чисел найдена " + arr[i] + " и " + arr[j]);
                    } else System.out.println("Пары не найдены");
                }
            }
        }

        public static void findTwoNums3(int[] arr, int x) {
            int start = arr[0];
            int end = arr[arr.length - 1];

            while (start + end != x) {
                if (start + end < x) {
                    start++;
                } else {
                    end--;
                }
            }
            if (start + end == x){
                System.out.println("Пара чисел найдена " + start + " и " + end);
            }else System.out.println("Пара чисел не найдена");
        }

        public static void findTwoNums4(ArrayList<Integer> num, int x) {

            int start = num.get(0);
            int end = num.get(num.size() -1);

            while (start + end != x) {
                if (start + end < x) {
                    start++;
                } else {
                    end--;
                }
            }
            if (start + end == x){
                System.out.println("Пара чисел найдена " + start + " и " + end);
            }else System.out.println("Пара чисел не найдена");
        }

    }

}
