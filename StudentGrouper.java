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
