package app.vehicles;

import app.vehicles.visitors.Visitor;

public interface Vehicle {
    public String getDescription();
    public void setLives(int lives);
    public int getLives();
    public boolean isRentable();
    public void accept(Visitor visitor);
    public void setState(State state);
    public State getState();
}
