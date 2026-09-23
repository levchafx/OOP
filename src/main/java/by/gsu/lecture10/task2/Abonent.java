package by.gsu.lecture10.task2;

public class Abonent {

    private int id;
    private String name;
    private long number;

    public Abonent(int id, String name, long number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Abonent{id=" + id + ", name='" + name + "', number=" + number + "}";
    }
}
