package lesson3.task2;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();
    String getName();
    String getFillColor();
    String getBorderColor();

    default void printInfo() {
        System.out.println(
                "Фигура " + getName()+
                        ": периметр "+ calculatePerimeter() +
                        ", площадь "+ calculateArea() +
                        ", цвет фона "+ getFillColor() +
                        ", цвет границ " + getBorderColor()
        );
    }
}
