package lesson3.task2;

public class Rectangle extends AbstractFigure {
    private final double  a;
    private final double  b;


    public Rectangle(double a, double b, String fillColor, String borderColor) {
        super(fillColor, borderColor);

        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Прямоугольник";
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
