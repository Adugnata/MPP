package lesson7.prob2;

public final class Rectangle implements ClosedCurve {
    final private double width;
    final private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double computePerimeter() {
        double area = width * length;
        return area;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
