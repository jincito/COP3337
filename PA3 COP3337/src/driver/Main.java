package driver;

import util.Date;
import util.DateTime;
import util.DateTimeInvalidException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<DateTime> startDateTimes = new ArrayList<>();
        ArrayList<DateTime> endDateTimes = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("""
                Welcome to Event Organizer!
                A program that organizes a set of events given by the keyboard.""");
        System.out.println("""
                Enter an event, or a sequence of multiple events, using the following information \
                
                separated by comma in a single line of input:
                • Event name (String with no comma)
                • Start Date and Time (MM/DD/YYYY @ hh:mm:ss am/pm)
                • End Date and Time (MM/DD/YYYY @ hh:mm:ss am/pm)
                • Host (String with no comma)
                • Number of Invitees (int)
                • Location (String with no comma)""");
        while (keyboard.hasNextLine()) {
            String input = keyboard.nextLine();
            String[] tokens = input.split(",");
            try {
                String eventName = tokens[0];
                String[] startDatePieces = tokens[1].split("/");
                String[] endDatePieces = tokens[2].split("/");
                String[] startTimePieces = tokens[0].split(":");
                String[] endTimePieces = tokens[2].split(":");
                String host = tokens[3];
                int invitees = Integer.parseInt(tokens[4]);
                String location = tokens[5];

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please Try Again!");
            }
        }
    }
}