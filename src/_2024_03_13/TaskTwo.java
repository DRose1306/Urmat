package _2024_03_13;

import java.util.Stack;

public class TaskTwo {
    public static void main(String[] args) {
        String withSharp = "##rt#r##rrr#r#";
        String fin = "rr";
        boolean result = getEq(withSharp, fin);
        System.out.println(result);

    }

    /**
     * withSharp = ##rt#r##rrr#r#
     * fin = rr
     * <p>
     * [ -1 2 4 3 -5] target 3
     */
    private static boolean getEq(String withSharp, String fin) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sB = new StringBuilder();
        char[] chars = withSharp.toCharArray();

        for (char letter : chars) {
            stack.add(letter);
        }

        for (int i = 0; i < stack.size(); i++) {
            if (stack.elementAt(i) == '#' && stack.elementAt(i + 1) == '#') {
                stack.remove(i);
                stack.remove(i + 1);
                i--;
            }
                sB.append(stack.get(i));
        }


        return sB.toString().equals(fin);
    }
}


