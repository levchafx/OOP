package by.gsu.lecture6.task2;

import by.gsu.lecture6.task2.com.company.details.Engine;
import by.gsu.lecture6.task2.com.company.professions.Driver;
import by.gsu.lecture6.task2.com.company.vehicles.Car;
import by.gsu.lecture6.task2.com.company.vehicles.Lorry;
import by.gsu.lecture6.task2.com.company.vehicles.SportCar;

public class Runner {

    public static void main(String[] args) {
        Car[] cars = new Car[5];

        cars[0] = new Lorry("Opel", "truck", new Driver("Иванов Иван", 5), new Engine(150, "Opel Motors"), 2000);
        cars[1] = new Lorry("Mercedes", "truck", new Driver("Петров Петр", 8), new Engine(300, "Mercedes-Benz"), 5000);
        cars[2] = new Lorry("Opel", "truck", new Driver("Сидоров Сидор", 12), new Engine(180, "Opel Motors"), 2500);
        cars[3] = new SportCar("BMW", "coupe", new Driver("Кузнецов Кузьма", 3), new Engine(450, "BMW Motorsport"), 300);
        cars[4] = new SportCar("Mercedes", "coupe", new Driver("Смирнов Смирн", 6), new Engine(500, "AMG"), 320);

        System.out.println("All cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nOpel lorries:");
        for (Car car : cars) {
            if (car instanceof Lorry && "Opel".equals(car.getBrand())) {
                System.out.println(car);
            }
        }
    }
}
