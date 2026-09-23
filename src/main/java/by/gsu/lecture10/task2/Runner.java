package by.gsu.lecture10.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    private static final String DB_URL = "jdbc:h2:./src/phonebook";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    public static void main(String[] args) throws IOException, SQLException {
        List<Abonent> abonents = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement()) {

            System.out.println("Connected to DB");

            runSqlScript("src/phonebook.sql", statement);

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Phonebook");
            while (resultSet.next()) {
                int id = resultSet.getInt("IdPhoneBook");
                String lastName = resultSet.getString("LastName");
                long phone = resultSet.getLong("Phone");
                abonents.add(new Abonent(id, lastName, phone));
            }
        }

        System.out.println("\nAbonents with id > 3:");
        for (Abonent abonent : abonents) {
            if (abonent.getId() > 3) {
                System.out.println(abonent);
            }
        }
    }

    private static void runSqlScript(String path, Statement statement) throws IOException, SQLException {
        StringBuilder command = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || line.startsWith("--")) {
                    continue;
                }
                command.append(line).append(" ");
                if (line.endsWith(";")) {
                    statement.execute(command.toString());
                    command.setLength(0);
                }
            }
        }
    }
}
