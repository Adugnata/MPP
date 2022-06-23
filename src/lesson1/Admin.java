package lesson1;

interface LandLord {
    Double rent();
}

class House implements LandLord {
    private double lot_size;

    public House(double lot_size) {
        this.lot_size = lot_size;
    }

    @Override
    public Double rent() {
        return 0.1 * lot_size;
    }
}

class Condominium implements LandLord {
    private int numberOfLots;

    public Condominium(int numberOfLots) {
        this.numberOfLots = numberOfLots;
    }

    @Override
    public Double rent() {
        return 400.0 * numberOfLots;
    }
}

class Trailer implements LandLord {

    @Override
    public Double rent() {
        return 5000.0;
    }
}

public class Admin {
    public static void main(String[] args) {
        Admin admin = new Admin();
        System.out.println("Total Rent is " + admin.totalRent());
    }

    double totalRent() {
        House house = new House(500);
        Condominium condominium = new Condominium(5);
        Trailer trailer = new Trailer();
        LandLord[] landLords = {house, condominium, trailer};
        double total_rent = 0;
        for (LandLord l : landLords
        ) {
            total_rent += l.rent();
        }
        return total_rent;
    }
}
