package by.gsu.lecture08.task3.by.gsu.asoilab.taxi;

public class ElectricCar extends PassengerCar {

    private double price;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String model, String licensePlate, int year, double price, int passengerCapacity) {
        super(model, licensePlate, year, passengerCapacity);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 1.2;
    }

    @Override
    public double calculateFuelConsumption() {
        return 18.0;
    }

    @Override
    public void refuel() {
        System.out.println("Зарядка от электросети");
    }

    @Override
    public String toString() {
        return super.toString() + ";" + price;
    }
}
