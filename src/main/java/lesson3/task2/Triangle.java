package lesson3.task2;

public class Triangle implements Figure {
    private final double a;
    private final double b;
    private final double c;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;

    }

    @Override
    public String getName() {
        return "Треугольник";
    }

    @Override
    public  String getFillColor() {
        return fillColor;
    }

    @Override
    public  String getBorderColor() {
        return borderColor;
    }

    @Override
    public double calculatePerimeter() {

        return a + b + c;
    }

    @Override
    public double calculateArea() {

        double p = (a + b + c) / 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}
