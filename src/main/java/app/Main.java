package app;

import app.vehicles.State;
import app.vehicles.bikes.ClassicBike;
import app.vehicles.bikes.utilities.Backpack;
import app.vehicles.bikes.utilities.Bike;
import app.vehicles.bikes.utilities.LuggageRack;
import app.vehicles.visitors.Visitor;
import app.vehicles.visitors.Worker;

public class Main {
    public static void main(String[] args) {
        Bike vehicle = new Backpack(new LuggageRack(new ClassicBike(0)));
        System.out.println(vehicle.getDescription());
        Visitor visitor = new Worker();
        vehicle.setLives(0);
        vehicle.accept(visitor);
        vehicle.setState(State.STORED);
        System.out.println(vehicle.isRentable());
        System.out.println(vehicle.getLives());
    }
}