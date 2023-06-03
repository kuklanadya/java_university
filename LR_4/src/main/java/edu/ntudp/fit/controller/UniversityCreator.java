package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;

public class UniversityCreator extends StructuralSubsectionCreator<Faculty> {
    public University create(String name, Human head, ArrayList<Faculty> faculties) {
        StructuralSubsection<Faculty> university = super.create(name, head, faculties);
        return new University(university);
    }
}
