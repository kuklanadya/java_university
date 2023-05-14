package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Sex;

public class HumanCreator {
    public Human create(String firstName, String middleName, String lastName, Sex sex) {
        return new Human(firstName, middleName, lastName, sex);
    }
}
