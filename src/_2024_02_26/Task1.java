package _2024_02_26;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10000; i++) {
            numbers.add(i);
        }

        T1 T1 = new T1(numbers, 0, 2499);
        T2 T2 = new T2(numbers, 2500, 4999);
        T3 T3 = new T3(numbers, 5000, 7499);
        T4 T4 = new T4(numbers, 7500, 10000);

        T1.start();
        T1.join();

        T2.start();
        T2.join();

        T3.start();
        T3.join();

        T4.start();
        T4.join();

        long sum = T1.getSum() + T2.getSum() + T3.getSum() + T4.getSum();
        System.out.println("sum of all Threads = " + sum);
    }
}

class T1 extends Thread {
    private List<Integer> numbers;
    private int start;
    private int end;
    private long sum;

    public T1(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += numbers.get(i);
        }
        System.out.println("T1 sum from " + start + " to " + end + " = " + sum);
    }
}

class T2 extends Thread {
    private List<Integer> numbers;
    private int start;
    private int end;
    private long sum;


    public T2(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += numbers.get(i);
        }
        System.out.println("T2 sum from " + start + " to " + end + " = " + sum);
    }
}

class T3 extends Thread {
    private List<Integer> numbers;
    private int start;
    private int end;
    private long sum;


    public T3(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += numbers.get(i);
        }
        System.out.println("T3 sum from " + start + " to " + end + " = " + sum);
    }
}

class T4 extends Thread {
    private List<Integer> numbers;
    private int start;
    private int end;
    private long sum;


    public T4(List<Integer> numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += numbers.get(i);
        }
        System.out.println("T4 sum from " + start + " to " + end + " = " + sum);
    }
}
