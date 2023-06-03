package edu.ntudp.fit;

import edu.ntudp.fit.controller.JsonManager;
import edu.ntudp.fit.model.University;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static edu.ntudp.fit.controller.Run.createTypicalUniversity;

public class JsonManagerTest {

    @Test
    public void readAndWriteUniversity() {
        University oldUniversity = createTypicalUniversity();
        JsonManager jsonManager = new JsonManager();
        String fileName = "university.json";
        jsonManager.writeToFile(oldUniversity, fileName);
        University newUniversity = jsonManager.readFromFile(fileName);
        Assertions.assertEquals(oldUniversity, newUniversity);
    }
}