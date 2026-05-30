package lesson7;

public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {

        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }

        return (double) a / b;
    }
}
