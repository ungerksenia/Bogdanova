package lesson3.task2;

public abstract class AbstractFigure implements Figure {
    protected final String fillColor;
    protected final String borderColor;

    public AbstractFigure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor()  {
        return borderColor;
    }
}
