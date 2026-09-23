package by.gsu.lecture05.task2;

public class Runner {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4.0, 6.0);
        Rectangle rectangle2 = new Rectangle(2.5, 10.0);

        System.out.println("Rectangle 1 perimeter: " + rectangle1.perimeterCalculator());
        System.out.println("Rectangle 1 area: " + rectangle1.areaCalculator());

        System.out.println("Rectangle 2 perimeter: " + rectangle2.perimeterCalculator());
        System.out.println("Rectangle 2 area: " + rectangle2.areaCalculator());
    }
}
