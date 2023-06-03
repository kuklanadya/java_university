package edu.ntudp.fit.model;

import java.util.ArrayList;

public class Faculty extends StructuralSubsection<Department> {
    public Faculty(String name, Human head, ArrayList<Department> departments) {
       super(name, head, departments);
    }

    public Faculty(StructuralSubsection<Department> faculty) {
        super(faculty);
    }

    public void addDepartment(ArrayList<Department> departments, Department department) {
        departments.add(department);
    }

    public void print(Faculty faculty) {
        System.out.println("Name of faculty: " + faculty.name);
        System.out.println("Head of faculty: " + faculty.head.getFullName());
        System.out.println("List of faculty departments: ");
        for (Department department : faculty.sections) {
            department.print(department);
        }
    }
}
