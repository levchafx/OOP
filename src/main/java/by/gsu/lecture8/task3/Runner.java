package by.gsu.lecture8.task3;

import java.util.Arrays;

import by.gsu.lecture8.task3.by.gsu.asoilab.taxi.ElectricCar;
import by.gsu.lecture8.task3.by.gsu.asoilab.taxi.PassengerCar;
import by.gsu.lecture8.task3.by.gsu.asoilab.taxi.TaxiFleet;
import by.gsu.lecture8.task3.by.gsu.asoilab.taxi.Vehicle;

public class Runner {

    public static void main(String[] args) {
        TaxiFleet fleet = new TaxiFleet();

        fleet.addVehicle(new PassengerCar("Opel Astra", "AB1111", 2015, 5));
        fleet.addVehicle(new PassengerCar("Toyota Camry", "AB2222", 2018, 5));
        fleet.addVehicle(new PassengerCar("Skoda Octavia", "AB3333", 2012, 5));
        fleet.addVehicle(new ElectricCar("Tesla Model 3", "AB4444", 2021, 45000, 5));
        fleet.addVehicle(new ElectricCar("Nissan Leaf", "AB5555", 2019, 30000, 5));

        System.out.println("All vehicles:");
        fleet.printAll();

        System.out.println("\nCost of a 30 km trip:");
        for (int i = 0; i < fleet.getCount(); i++) {
            Vehicle vehicle = fleet.getVehicles()[i];
            System.out.println(vehicle.getModel() + ": " + vehicle.calculateCost(30));
        }

        Vehicle[] vehicles = Arrays.copyOf(fleet.getVehicles(), fleet.getCount());
        Arrays.sort(vehicles);

        System.out.println("\nSorted by year:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        fleet.saveToFile("src/taxi_fleet.csv");
        System.out.println("\nSaved to src/taxi_fleet.csv");
    }
}
