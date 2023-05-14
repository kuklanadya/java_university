package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.Human;
import edu.ntudp.fit.model.Sex;
import edu.ntudp.fit.model.StructuralSubsection;

import java.util.ArrayList;

public class StructuralSubsectionCreator<T> {
    public StructuralSubsection<T> create(String name, Human head, ArrayList<T> sections) {
        return new StructuralSubsection(name, head, sections);
    }
}
