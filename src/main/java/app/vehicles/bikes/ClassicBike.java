package app.vehicles.bikes;

import app.vehicles.ClassicVehicle;
import app.vehicles.bikes.utilities.Bike;
import app.vehicles.visitors.Visitor;

public class ClassicBike extends ClassicVehicle implements Bike {
    public static final String DESCRIPTION = "Bike";

    public static final int INITIAL_LIVES = 10;

    public ClassicBike(int id) {
        super(id);
        this.description = DESCRIPTION;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
