package by.gsu.lecture6.task2.com.company.details;

public class Engine {

    private double power;
    private String manufacturer;

    public Engine() {
    }

    public Engine(double power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{power=" + power + ", manufacturer='" + manufacturer + "'}";
    }
}
