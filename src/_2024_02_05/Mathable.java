package _2024_02_05;

public interface Mathable {
    double divide(int a, int b) throws Exception;
}

class MathImpl implements Mathable {

    @Override
    public double divide(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        new MathImpl().divide(2, 5);
    }
}