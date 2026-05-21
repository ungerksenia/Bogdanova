package lesson3.task2;

public class Circle extends AbstractFigure {
    private final double radius;

    public Circle(double radius,  String fillColor, String borderColor) {
        super(fillColor, borderColor);

        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Круг";
    }

    @Override
    public double calculatePerimeter() {

        return 2 * Math.PI * radius;

    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;

    }

}
