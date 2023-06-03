package edu.ntudp.fit.controller;
import java.sql.*;
        import java.util.Scanner;

public class DatabaseService {
    private Connection connection;
    private static final String DATABASE_URL = "jdbc:sqlserver://WIN-Q36JME6DDDI;databaseName=JAVA_lab5;encrypt=false";
    private static final String userName = "user";
    private static final String userPassword = "11111111";

    public void connect() {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, userName, userPassword);
            System.out.println("Connected to the database.");
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getStudentsByMonth() {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter month number: ");
            int month = scanner.nextInt();

            String selectQuery = "SELECT * FROM Students WHERE MONTH(birthday) = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, month);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("List of students born in " + month + "month:");
            while (resultSet.next()) {
                String firstName = resultSet.getString("firstName");
                String middleName = resultSet.getString("middleName");
                String lastName = resultSet.getString("lastName");
                Date birthday = resultSet.getDate("birthday");
                System.out.println(lastName + " " + firstName + " " + middleName + ", " + birthday);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}