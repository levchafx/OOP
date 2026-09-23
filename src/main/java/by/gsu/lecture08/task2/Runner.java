package by.gsu.lecture08.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Worker[] workers = new Worker[7];

        try (Scanner sc = new Scanner(new FileReader("src/in.txt"))) {
            int i = 0;
            while (sc.hasNext() && i < workers.length) {
                String surname = sc.next();
                String position = sc.next();
                int experience = sc.nextInt();
                workers[i] = new Worker(surname, position, experience);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
