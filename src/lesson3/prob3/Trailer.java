package lesson3.prob3;


public class Trailer extends Property {
    private static final double RENT = 500;
    private Address address;

    public Trailer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public double computeRent() {
        return RENT;
    }

}
