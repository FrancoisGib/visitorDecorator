package app.vehicles.bikes.utilities;


public class LuggageRack extends BikeDecorator {
    public static final String DESCRIPTION = "Luggage Rack";

    public LuggageRack(Bike vehicle) {
        super(vehicle);
        this.description = DESCRIPTION;
    }
}
