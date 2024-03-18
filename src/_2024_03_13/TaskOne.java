package _2024_03_13;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(findPath(3, 3));
    }

    public static int findPath(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        return findPath(n - 1, m) + findPath(n, m - 1);
    }
}
