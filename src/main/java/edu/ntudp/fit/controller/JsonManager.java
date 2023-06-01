package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.University;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;

public class JsonManager {

    private static Gson gson;

    public JsonManager() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public static void writeToFile(University university, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            gson.toJson(university, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static University readFromFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}