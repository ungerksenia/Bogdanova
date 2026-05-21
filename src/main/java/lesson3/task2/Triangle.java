package lesson3.task2;

public class Triangle extends AbstractFigure {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        super(fillColor, borderColor);

        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public String getName() {
        return "Треугольник";
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
