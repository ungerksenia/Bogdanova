package lesson3.task2;

public class Circle implements Figure {
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius,  String fillColor, String borderColor) {

        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return "Круг";
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

        return 2 * Math.PI * radius;

    }

    @Override
    public double calculateArea() {

        return Math.PI * radius * radius;

    }

}
