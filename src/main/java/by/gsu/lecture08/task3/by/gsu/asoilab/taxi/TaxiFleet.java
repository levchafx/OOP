package by.gsu.lecture08.task3.by.gsu.asoilab.taxi;

import java.io.FileWriter;
import java.io.IOException;

public class TaxiFleet {

    private static final int DEFAULT_SIZE = 10;

    private Vehicle[] vehicles;
    private int count;

    public TaxiFleet() {
        this(DEFAULT_SIZE);
    }

    public TaxiFleet(int maxSize) {
        this.vehicles = new Vehicle[maxSize];
        this.count = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        if (count >= vehicles.length) {
            System.out.println("Нет места в таксопарке для " + vehicle.getModel());
            return;
        }
        vehicles[count] = vehicle;
        count++;
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(vehicles[i]);
        }
    }

    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < count; i++) {
                writer.write(vehicles[i].toString());
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public int getCount() {
        return count;
    }
}
