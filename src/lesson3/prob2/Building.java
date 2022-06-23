package lesson3.prob2;

import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartmentList;

    public Building(double maintenanceCost, List<Apartment> apartmentList) {
        this.maintenanceCost = maintenanceCost;
        this.apartmentList = apartmentList;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public double profit() {
        return apartmentList.stream().mapToDouble(Apartment::getRent).sum() - getMaintenanceCost();
    }
}
