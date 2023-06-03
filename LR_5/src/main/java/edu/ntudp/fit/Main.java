package edu.ntudp.fit;

import edu.ntudp.fit.controller.DatabaseService;

public class Main {
    public static void main(String[] args) {
        DatabaseService databaseService = new DatabaseService();
        databaseService.connect();
        databaseService.getStudentsByMonth();
        databaseService.disconnect();
    }
}