package by.gsu.lecture08.task3.by.gsu.asoilab.taxi;

public interface Movable {

    void start();

    void stop();

    void refuel();

    double calculateCost(double distance);
}
