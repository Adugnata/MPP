package lesson7.prob2;

public final class Ellipse implements ClosedCurve {
    private final double semi_major_axis;
    private final double eccentricity;

    public Ellipse(double semi_major_axis, double eccentricity) {
        this.semi_major_axis = semi_major_axis;
        this.eccentricity = eccentricity;
    }

    @Override
    public double computePerimeter() {
        return 4 * semi_major_axis * eccentricity;
    }
}
