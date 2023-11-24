package app.vehicles;

import app.vehicles.visitors.Rentable;
import app.vehicles.visitors.Visitor;
import lombok.Getter;
import lombok.Setter;

public abstract class ClassicVehicle implements Rentable, Vehicle {
    @Getter
    protected int id;

    @Getter
    protected String description;

    @Getter @Setter
    protected int lives;

    @Getter @Setter
    protected State state;

    public ClassicVehicle(int id) {
        this.id = id;
    }

    public boolean isRentable() {
        return this.state == State.STORED && this.lives > 0;
    }

    public abstract void accept(Visitor visitor);
}

