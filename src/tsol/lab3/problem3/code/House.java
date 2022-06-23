package tsol.lab3.problem3.code;

public class House extends Property {

    private double lotSize;


    public House(double lotSize) {
        this.lotSize = lotSize;
    }


    public double computeRent() {
        return 0.1 * lotSize;
    }
}
