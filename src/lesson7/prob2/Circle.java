package lesson7.prob2;

public final class Circle implements ClosedCurve {
    final private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
