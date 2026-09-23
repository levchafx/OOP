package by.gsu.lecture8.task3.by.gsu.asoilab.taxi;

public class PassengerCar extends Vehicle {

    private int passengerCapacity;

    public PassengerCar() {
        super();
    }

    public PassengerCar(String model, String licensePlate, int year, int passengerCapacity) {
        super(model, licensePlate, year);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateCost(double distance) {
        return distance * 1.5;
    }

    @Override
    public double calculateFuelConsumption() {
        return 8.5;
    }

    @Override
    public void refuel() {
        System.out.println("Заправка бензином");
    }

    @Override
    public String toString() {
        return super.toString() + ";" + passengerCapacity;
    }
}
