package edu.ntudp.fit.model;

import java.util.ArrayList;

public class University extends StructuralSubsection<Faculty>{
    public University(String name, Human head, ArrayList<Faculty> faculties) {
        super(name, head, faculties);
    }

    public University(StructuralSubsection<Faculty> university) {
        super(university);
    }

    public void addFaculty(ArrayList<Faculty> faculties, Faculty faculty) {
        faculties.add(faculty);
    }

    public void print(University university) {
        System.out.println("Name of university: " + university.name);
        System.out.println("Head of university: " + university.head.getFullName());
        System.out.println("List of university faculties: ");
        for (Faculty faculty : university.sections) {
            faculty.print(faculty);
        }
    }
}
