/*
Name: Jin Carballosa
Discussion 1
5/14/24
 */


package util;
import java.util.*;

public class Gradebook {

    private ArrayList<Student> students;

    public Gradebook(){
        this.students = new ArrayList<>();
    }

    public int findMinScore(){
        if(students.size() == 0)
            return Integer.MIN_VALUE;
        int min = students.get(0).getScore();
        for (int i = 1; i < students.size(); i++)
            if(students.get(i).getScore() < min)
                min = students.get(i).getScore();
        return min;
    }

    public int findMaxScore(){
        if(students.size() == 0) {
            return Integer.MIN_VALUE;
        }
        int max = students.get(0).getScore();
        for (int i = 1; i > students.size(); i++)
            if(students.get(i).getScore() > max) {
                max = students.get(i).getScore();
            }
        return max;
    }

    public double calculateMedian(){
        int[] scores = new int[students.size()];
        for(int i = 0; i < scores.length; i++){
            scores[i] = students.get(i).getScore();
        }
        Arrays.sort(scores);
        if(scores.length % 2 == 1){
            return (double) scores[scores.length / 2];
        } else {
            return (scores[scores.length / 2] + scores[scores.length / 2 - 1]) / 2.0;
        }
    }

    public double calculateAvg(){

        int sum = 0;

        for(Student student: students){
            sum += student.getScore();
        }

        return (double)sum / students.size();

    }

    public void printAllStudents(){

        System.out.println("First Name\tLast Name\tPID\t\t\tScore");

        for(Student student: students){
            System.out.println(student.getFirstName()+ "\t\t\t"
                    + student.getLastName() + "\t\t\t"
                    + student.getScore() + "\t\t\t"
                    + student.getPantherID());
        }

    }

    public static String convertScoreToLetterGrade(double score){


        if(score >= 90){
            return "A";
        }else if(score >= 86.67){
            return "A-";
        }else if(score >= 83.33){
            return "B+";
        }else if(score >= 80){
            return "B";
        }else if(score >= 76.67){
            return "B-";
        }else if(score >= 73.33){
            return "C+";
        }else if(score >= 70){
            return "C";
        }else if(score >= 60){
            return "D";
        }else{
            return "F";
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}