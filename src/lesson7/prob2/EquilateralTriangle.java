package lesson7.prob2;

public final class EquilateralTriangle implements Polygon {
    private final int side;

    public EquilateralTriangle(int side) {
        this.side = side;
    }

    @Override
    public double[] getSides() {
        return new double[]{side, side, side};
    }

    @Override
    public double computePerimeter() {
        return Polygon.super.computePerimeter();
    }
}
