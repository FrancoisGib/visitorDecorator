package app.vehicles;

import app.vehicles.visitors.Visitor;

public class Scooter extends ClassicVehicle {
    public static final String DESCRIPTION = "Scooter";

    public static final int INITIAL_LIVES = 20;

    public Scooter(int id) {
        super(id);
        this.description = DESCRIPTION;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}