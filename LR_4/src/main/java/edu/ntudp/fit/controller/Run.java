package edu.ntudp.fit.controller;

import edu.ntudp.fit.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        createTypicalUniversity();
    }

    public static University createTypicalUniversity() {
        HumanCreator humanCreator = new HumanCreator();
        Human head1 = humanCreator.create("Ethan", "Joseph", "Thompson", Sex.MALE);
        Human head2 = humanCreator.create("Samuel", "David", "Parker", Sex.MALE);
        Human head3 = humanCreator.create("Isabella", "Clarie", "White", Sex.FEMALE);

        StudentCreator studentCreator = new StudentCreator();
        Student student1 = studentCreator.create("Mike", "James", "Scott", Sex.MALE);
        Student student2 = studentCreator.create("Emily", "Grace", "Williams", Sex.FEMALE);
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(student1, student2));

        GroupCreator groupCreator = new GroupCreator();
        Group group1 = groupCreator.create("Group 1", head1, students);
        Group group2 = groupCreator.create("Group 2", head2, students);
        ArrayList<Group> groups = new ArrayList<Group>();

        DepartmentCreator departmentCreator = new DepartmentCreator();
        Department department1 = departmentCreator.create("Department of Mathematics", head2, groups);
        Department department2 = departmentCreator.create("Department of Physics", head3, groups);
        ArrayList<Department> departments = new ArrayList<Department>();

        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty1 = facultyCreator.create("Faculty of Science", head3, departments);
        Faculty faculty2 = facultyCreator.create("Faculty of Mathematics", head1, departments);
        ArrayList<Faculty> faculties = new ArrayList<Faculty>();

        department1.addGroup(groups, group1);
        department1.addGroup(groups, group2);
        department2.addGroup(groups, group1);
        department2.addGroup(groups, group2);

        faculty1.addDepartment(departments, department1);
        faculty1.addDepartment(departments, department2);
        faculty2.addDepartment(departments, department1);
        faculty2.addDepartment(departments, department2);

        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.create("Typical University", head1, faculties);
        university.addFaculty(faculties, faculty1);
        university.addFaculty(faculties, faculty2);
        university.print(university);
        return university;
    }
}