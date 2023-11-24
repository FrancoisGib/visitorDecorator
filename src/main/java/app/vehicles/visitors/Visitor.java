package app.vehicles.visitors;

import app.vehicles.Scooter;
import app.vehicles.bikes.ClassicBike;

public interface Visitor {
    public void visit(ClassicBike bike);
    public void visit(Scooter scooter);
}
