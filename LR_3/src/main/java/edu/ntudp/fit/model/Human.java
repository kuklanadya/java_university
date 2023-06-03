package edu.ntudp.fit.model;

public class Human {
    private String firstName;
    private String middleName;
    private String lastName;
    private Sex sex;

    public Human(String firstName, String lastName, String middleName, Sex sex) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public Human(Human human) {
        this.firstName = human.firstName;
        this.middleName = human.middleName;
        this.lastName = human.lastName;
        this.sex = human.sex;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
}
