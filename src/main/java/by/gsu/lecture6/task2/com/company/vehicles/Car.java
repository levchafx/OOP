package by.gsu.lecture6.task2.com.company.vehicles;

import by.gsu.lecture6.task2.com.company.details.Engine;
import by.gsu.lecture6.task2.com.company.professions.Driver;

public class Car {

    private String brand;
    private String carClass;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String brand, String carClass, Driver driver, Engine engine) {
        this.brand = brand;
        this.carClass = carClass;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car{brand='" + brand + "', carClass='" + carClass + "', driver=" + driver + ", engine=" + engine + "}";
    }
}
