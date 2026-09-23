package by.gsu.lecture9.task2;

public class Student {

    private String name;
    private String group;
    private int course;
    private double averageGrade;

    public Student() {
    }

    public Student(String name, String group, int course, double averageGrade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course + ", averageGrade=" + averageGrade + "}";
    }
}
