package driver;
import util.Gradebook;
import util.Student;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        Gradebook myGradebook = new Gradebook();
        ArrayList<Student> list = myGradebook.getStudents();
        list.add(new Student("A", "Z", 1234567, 78));
        list.add(new Student("B", "Y", 7654321, 98));
        list.add(new Student("C", "X", 1234765, 88));
        myGradebook.printAllStudents();
        double avg = myGradebook.calculateAvg();
        System.out.printf("Avg is %.2f\n", avg);
        System.out.printf("Avg letter grade is %s.\n", avg);
    }
}
