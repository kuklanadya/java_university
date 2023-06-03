package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;

public class DepartmentCreator extends StructuralSubsectionCreator<Group> {
    public Department create(String name, Human head, ArrayList<Group> groups) {
        StructuralSubsection<Group> department = super.create(name, head, groups);
        return new Department(department);
    }
}
