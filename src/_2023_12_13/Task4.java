package _2023_12_13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        //- Печать элементов Queue в обратном порядке
        //  public static void printInReverse(Queue<String> queue)

        Queue<String> queue = new LinkedList<>();
        queue.add("aa");
        queue.add("bb");
        queue.add("cc");
        queue.add("dd");

        printInReverse(queue);
    }
    public static void printInReverse(Queue<String> queue) {
        if (queue.isEmpty()) {
            System.out.println("NoSuchElementException");
        }

        Stack<String> stack = new Stack<>();
        stack.addAll(queue);

        System.out.print("Элементы очереди в обратном порядке: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
