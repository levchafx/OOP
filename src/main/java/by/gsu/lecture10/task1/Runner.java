package by.gsu.lecture10.task1;

import java.util.Scanner;

public class Runner {

    private static final String STORED_USERNAME = "admin";
    private static final String STORED_PASSWORD = "admin123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (STORED_USERNAME.equals(username) && STORED_PASSWORD.equals(password)) {
            System.out.println("Connected to DB");
        } else {
            System.out.println("Failed to connect to DB: invalid username or password");
        }
    }
}
