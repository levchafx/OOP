package by.gsu.lecture8.task3.by.gsu.asoilab.taxi;

public interface Movable {

    void start();

    void stop();

    void refuel();

    double calculateCost(double distance);
}
