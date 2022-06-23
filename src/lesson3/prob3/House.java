package lesson3.prob3;


public class House extends Property {
    private double lotSize;
    private Address address;

    public House(Address address, double lotSize) {
        this.address = address;
        this.lotSize = lotSize;
    }

    public Address getAddress() {
        return address;
    }

    public double computeRent() {
        return 0.1 * lotSize;
    }
}
