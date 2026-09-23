package by.gsu.lecture5.task1;

public class Runner {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2015);
        Car car3 = new Car(2020, "red");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
