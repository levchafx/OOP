package by.gsu.lecture06.task2.com.company.vehicles;

import by.gsu.lecture06.task2.com.company.details.Engine;
import by.gsu.lecture06.task2.com.company.professions.Driver;

public class SportCar extends Car {

    private double topSpeed;

    public SportCar() {
        super();
    }

    public SportCar(String brand, String carClass, Driver driver, Engine engine, double topSpeed) {
        super(brand, carClass, driver, engine);
        this.topSpeed = topSpeed;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" + super.toString() + ", topSpeed=" + topSpeed + "}";
    }
}
