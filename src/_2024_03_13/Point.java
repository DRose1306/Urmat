package _2024_03_13;

/**
 * P(n, m) = P(n-1, m) + P(n, m-1)
 */
public class Point {

    public int getWays(int n, int m) {
        if(n < 1 || m < 1) {
            return 0;
        }

        if(n == 1 && m == 1) {
            return 1;
        }

        return getWays(n-1, m) + getWays(n, m-1);
    }

    /**
     * withSharp = ##rt#r##rrr#r#
     * fin = rr
     *
     * [ -1 2 4 3 -5] target 3
      */
    private boolean getEq(String withSharp, String fin) {
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Point().getWays(3, 3));
    }
}