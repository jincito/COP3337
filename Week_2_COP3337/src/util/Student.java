/*
Name: Jin Carballosa
Discussion 1
5/14/24
 */


package util;

public class Student {

    private String firstName;
    private String lastName;
    private int pantherID;
    private int score;

    public Student(){
        firstName = "John";
        lastName = "Doe";
        pantherID = -1;
        score = -1;
    }

    public Student(String firstName, String lastName, int pantherID, int score){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherID = pantherID;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPantherID() {
        return pantherID;
    }
}