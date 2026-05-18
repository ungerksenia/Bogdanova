package lesson3.task2;

public class Rectangle implements Figure {
    private final double  a;
    private final double  b;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double a, double b, String  fillColor, String borderColor ) {

        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;

    }

    @Override
    public String getName() {
        return "Прямоугольник";
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

        return 2*(a + b);

    }

    @Override
    public double calculateArea() {

        return a*b;

    }
}
