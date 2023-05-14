package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Department;
import edu.ntudp.fit.model.Faculty;
import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.StructuralSubsection;

import java.util.ArrayList;

public class FacultyCreator extends StructuralSubsectionCreator<Department>  {
    public Faculty create(String name, Human head, ArrayList<Department> departments) {
        StructuralSubsection<Department> faculty = super.create(name, head, departments);
        return new Faculty(faculty);
    }

}