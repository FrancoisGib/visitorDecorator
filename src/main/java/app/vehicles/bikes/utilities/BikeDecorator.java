package app.vehicles.bikes.utilities;

import app.vehicles.VehicleDecorator;
import app.vehicles.visitors.Visitor;

public abstract class BikeDecorator extends VehicleDecorator implements Bike {
    protected Bike vehicle;

    public BikeDecorator(Bike vehicle) {
        super(vehicle);
        this.vehicle = vehicle;
    }

    public void accept(Visitor visitor) {
        this.vehicle.accept(visitor);
    }
}