package edu.ntudp.fit.model;

public class Student extends Human {
    public Student(String firstName, String lastName, String middleName, Sex sex) {
        super(firstName, lastName, middleName, sex);
    }

    public Student(Human student) {
        super(student);
    }
}