package _2024_02_14;

import _2024_02_14.task1.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {
    private static final Task1 TASK_1 = new Task1();
    private static final int a = 10;
    private static final int b = 2;

    @Test
    void additionTest() {
        Assertions.assertEquals(12, TASK_1.addition(a, b));
    }

    @Test
    void subtractTest() {
        Assertions.assertEquals(8, TASK_1.subtract(a, b));
    }

    @Test
    void multiplyTest() {
        Assertions.assertEquals(20, TASK_1.multiply(a, b));

    }

    @Test
    void dividePositiveTest() {
        Assertions.assertEquals(5, TASK_1.divide(a, b));
        Assertions.assertEquals(-5, TASK_1.divide(a, -2));
    }

    @Test
    void divideArithmeticExceptionTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> TASK_1.divide(a, 0));
    }

    @Test
    void powerTest() {
        Assertions.assertEquals(1, TASK_1.power(a, 0));
        Assertions.assertEquals(0, TASK_1.power(0, b));
        Assertions.assertEquals(0.01, TASK_1.power(a, -2));
        Assertions.assertEquals(100, TASK_1.power(a, b));

    }

    @Test
    void factorialTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> TASK_1.factorial(-2));
        Assertions.assertEquals(1, TASK_1.factorial(0));
        Assertions.assertEquals(1, TASK_1.factorial(1));
        Assertions.assertEquals(3628800, TASK_1.factorial(a));
    }

    @Test
    void absoluteTest() {
        Assertions.assertEquals(2, TASK_1.absolute(-2));
        Assertions.assertEquals(3, TASK_1.absolute(3));
    }

    @Test
    void sqrtTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> TASK_1.sqrt(-2));
        Assertions.assertEquals(2, TASK_1.sqrt(4));
    }

    @Test
    void logarithmTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> TASK_1.logarithm(0, 1));
        Assertions.assertEquals(8, TASK_1.logarithm(256, 2));
    }


    @Test
    void convertDegreesToRadianTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> TASK_1.convertDegreesToRadian(-1));
        Assertions.assertEquals(0.524, TASK_1.convertDegreesToRadian(30));
    }

    @Test
    void sinTest() {
        Assertions.assertEquals(0.5, TASK_1.sin(0.524));

    }
}