package _2023_12_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //- Реализуйте функцию, которая осуществляет циклический сдвиг элементов в Queue<String>.
        Queue<String> queue = new LinkedList<>();
        queue.add("aa");
        queue.add("bb");
        queue.add("cc");
        queue.add("dd");

        System.out.println("Выберите количество сдигов 'k' ");
        int k = new Scanner(System.in).nextInt();
        System.out.println();
        System.out.println("Очередь до сдвига: " + queue);
        System.out.println();
        System.out.println("Очередь после " + k + " сдвигов " + rotate(queue, k));

    }

    public static Queue<String> rotate(Queue<String> queue, int k) {
        int count = queue.size() - k % queue.size();
        for (int i = 0; i < count; i++) {
            String temp = queue.remove();
            queue.add(temp);
        }
        return queue;

    }
}
