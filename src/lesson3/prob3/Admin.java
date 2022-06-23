package lesson3.prob3;

import java.util.List;

public class Admin {
    public static double computeTotalRent(List<Property> properties) {
        return properties.stream().mapToDouble(Property::computeRent).sum();
    }
}
