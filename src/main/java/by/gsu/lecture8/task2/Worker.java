package by.gsu.lecture8.task2;

public class Worker {

    private String surname;
    private String position;
    private int experience;

    public Worker() {
    }

    public Worker(String surname, String position, int experience) {
        this.surname = surname;
        this.position = position;
        this.experience = experience;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker{surname='" + surname + "', position='" + position + "', experience=" + experience + "}";
    }
}
