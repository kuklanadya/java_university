package edu.ntudp.fit.model;

import java.util.ArrayList;

public class Department extends StructuralSubsection<Group>  {
    public Department(String name, Human head, ArrayList<Group> groups) {
        super(name, head, groups);
    }

    public Department(StructuralSubsection<Group> department) {
        super(department);
    }

    public void addGroup(ArrayList<Group> groups, Group group) {
        groups.add(group);
    }

    public void print(Department department) {
        System.out.println("Name of department: " + department.name);
        System.out.println("Head of department: " + department.head.getFullName());
        System.out.println("List of department groups: ");
        for (Group group : department.sections) {
            group.print(group);
        }
    }
}