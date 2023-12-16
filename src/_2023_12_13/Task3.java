package _2023_12_13;

import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        //- Реализуйте функцию, которая использует Stack<String> для реверса строки.
        //  public static String reverse(String str)

        Stack<String> stack = new Stack<>();
        stack.push("ab");
        stack.push("cd");
        stack.push("ed");

        System.out.println(stringReverse(stack));
    }
    public static String stringReverse(Stack<String> stack){
        StringBuilder sB = new StringBuilder();
        sB.append(stack.get(stack.size() -1)).reverse();
        return sB.toString();
    }
}
