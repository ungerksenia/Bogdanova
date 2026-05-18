package lesson3.task2;

public class FigureApp {
    public static void main(String[] args) {

        Circle circle = new Circle(2, "синий", "оранжевый");
        Triangle triangle = new Triangle(4, 5, 6, "лиловый", "малиновый" );
        Rectangle rectangle = new Rectangle(7, 9, "васильковый", "желтый");

        circle.printInfo();
        triangle.printInfo();
        rectangle.printInfo();

    }
}
