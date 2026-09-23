package by.gsu.lecture5.task3;

public class Sportsman {

    private static final int PASS = 70;

    private String fullName;
    private int result1;
    private int result2;

    public Sportsman() {
    }

    public Sportsman(String fullName, int result1, int result2) {
        this.fullName = fullName;
        this.result1 = result1;
        this.result2 = result2;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getResult1() {
        return result1;
    }

    public void setResult1(int result1) {
        this.result1 = result1;
    }

    public int getResult2() {
        return result2;
    }

    public void setResult2(int result2) {
        this.result2 = result2;
    }

    public boolean isMaster() {
        return result1 >= PASS && result2 >= PASS;
    }

    @Override
    public String toString() {
        return fullName + ";" + result1 + ";" + result2 + ";" + isMaster();
    }
}
