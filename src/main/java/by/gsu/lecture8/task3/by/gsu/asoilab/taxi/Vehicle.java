package by.gsu.lecture8.task3.by.gsu.asoilab.taxi;

public abstract class Vehicle implements Movable, Comparable<Vehicle> {

    private String model;
    private String licensePlate;
    private int year;

    public Vehicle() {
    }

    public Vehicle(String model, String licensePlate, int year) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract double calculateFuelConsumption();

    @Override
    public void start() {
        System.out.println("Машина " + model + " поехала");
    }

    @Override
    public void stop() {
        System.out.println("Машина " + model + " остановилась");
    }

    @Override
    public String toString() {
        return model + ";" + licensePlate + ";" + year;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.year, other.year);
    }
}
