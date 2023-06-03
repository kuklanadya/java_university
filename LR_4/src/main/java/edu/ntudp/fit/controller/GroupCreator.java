package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Group;
import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.StructuralSubsection;
import edu.ntudp.fit.model.Student;

import java.util.ArrayList;

public class GroupCreator extends StructuralSubsectionCreator<Student> {
    public Group create(String name, Human head, ArrayList<Student> students) {
        StructuralSubsection<Student> group = super.create(name, head, students);
        return new Group(group);
    }
}
