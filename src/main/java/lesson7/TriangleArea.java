package lesson7;

public class TriangleArea {

    public static double triangleArea(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c
                || a + c <= b
                || b + c <= a) {
            throw new IllegalArgumentException("Такого треугольника не существует");
        }
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
