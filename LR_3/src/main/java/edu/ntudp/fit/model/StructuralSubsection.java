package edu.ntudp.fit.model;

import java.util.ArrayList;

public class StructuralSubsection<T> {
    protected String name;
    protected Human head;
    protected ArrayList<T> sections;

    public StructuralSubsection(String name, Human head, ArrayList<T> sections) {
        this.name = name;
        this.head = head;
        this.sections = sections;
    }

    public StructuralSubsection(StructuralSubsection structuralSubsection) {
        this.name = structuralSubsection.name;
        this.head = structuralSubsection.head;
        this.sections = structuralSubsection.sections;
    }
}
