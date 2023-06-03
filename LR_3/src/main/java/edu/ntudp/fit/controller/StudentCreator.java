package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Sex;
import edu.ntudp.fit.model.Student;

public class StudentCreator extends HumanCreator {
    public Student create(String firstName, String middleName, String lastName, Sex sex) {
        Human student = super.create(firstName, middleName, lastName, sex);
        return new Student(student);
    }
}

