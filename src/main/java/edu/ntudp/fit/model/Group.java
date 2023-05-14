package edu.ntudp.fit.model;

import java.util.ArrayList;

public class Group extends StructuralSubsection<Student> {
    public Group(String name, Human head, ArrayList<Student> students) {
        super(name, head, students);
    }

    public Group(StructuralSubsection<Student> group) {
        super(group);
    }

    public void addStudent( ArrayList<Student>students, Student student) {
        students.add(student);
    }

    public void print(Group group) {
        System.out.println("Name of group: " + group.name);
        System.out.println("Head of group: " + group.head.getFullName());
        System.out.println("List of group students: ");
        for (Student student : group.sections) {
            System.out.println(student.getFullName());
        }
    }
}
