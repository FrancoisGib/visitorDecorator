package app.vehicles.bikes.utilities;

public class Backpack extends BikeDecorator {
    public static final String DESCRIPTION = "Backpack";

    public Backpack(Bike bike) {
        super(bike);
        this.description = DESCRIPTION;
    }
}
