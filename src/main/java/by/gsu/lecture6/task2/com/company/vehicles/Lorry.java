package by.gsu.lecture6.task2.com.company.vehicles;

import by.gsu.lecture6.task2.com.company.details.Engine;
import by.gsu.lecture6.task2.com.company.professions.Driver;

public class Lorry extends Car {

    private double loadCapacity;

    public Lorry() {
        super();
    }

    public Lorry(String brand, String carClass, Driver driver, Engine engine, double loadCapacity) {
        super(brand, carClass, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" + super.toString() + ", loadCapacity=" + loadCapacity + "}";
    }
}
