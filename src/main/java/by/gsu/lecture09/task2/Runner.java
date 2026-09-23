package by.gsu.lecture09.task2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static final double PASS_GRADE = 3;

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иванов Иван", "IT-21", 1, 4.2));
        students.add(new Student("Петров Петр", "IT-21", 1, 2.5));
        students.add(new Student("Сидорова Анна", "IT-22", 2, 3.8));

        for (Student student : students) {
            if (student.getAverageGrade() >= PASS_GRADE) {
                student.setCourse(student.getCourse() + 1);
            }
        }

        System.out.println("All students after promotion check:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nStudents on course 2:");
        printStudents(students, 2);
    }

    static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
