package app.vehicles.visitors;

import app.vehicles.Scooter;
import app.vehicles.bikes.ClassicBike;

public class Worker implements Visitor {
    public void visit(ClassicBike bike) {
        bike.setLives(ClassicBike.INITIAL_LIVES);
    }

    public void visit(Scooter scooter) {
        scooter.setLives(Scooter.INITIAL_LIVES);
    }
}
