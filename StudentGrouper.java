"""
Generated with Brave Leo AI with Llama 3.1 8B
    Prompt 1: write starter code with TO DO comments for a Java program that groups students randomly
    Prompt 2: provide a sample solution
    Prompt 3: I want to be able to call the function with an int parameter to choose the size of the groups
    Prompt 4: write an updated skeleton with TO DO comments
"""

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StudentGrouper {

    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // TO DO: Add Student objects to the ArrayList

        // TO DO: Call the groupStudents function with a group size
    }

    public static void groupStudents(ArrayList<Student> students, int groupSize) {
        // TO DO: Randomly shuffle the ArrayList of Student objects

        // TO DO: Divide the shuffled ArrayList into groups of the specified size

        // TO DO: Print out the groups of students
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
