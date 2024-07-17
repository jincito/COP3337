package driver;
import util.*;
import util.Date;

import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<DateTime> dateTimes = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a sequence of date/times in the " +
                "following format: MM/DD/YYYY @ hh:mm:ss am/pm:");
        while(keyboard.hasNextLine()){
            String input = keyboard.nextLine();
            String[] tokens = input.split(" ");
            try {
                if (tokens.length != 4)
                    throw new Exception(input + " is not valid!");
                String[] datePieces = tokens[0].split("/");
                String[] timePieces = tokens[2].split(":");
                if(!tokens[3].equalsIgnoreCase("am") &&
                        !tokens[3].equalsIgnoreCase("pm"))
                    throw new Exception(tokens[3] + " is not valid!");
                boolean am = tokens[3].equalsIgnoreCase("am");
                if(datePieces.length != 3)
                    throw new Exception(tokens[0] + " is not valid!");
                if(timePieces.length != 3)
                    throw new Exception(tokens[2] + " is not valid!");
                if(!tokens[1].equalsIgnoreCase("@"))
                    throw  new Exception(tokens[1] + " is not valid!");
                int month = Integer.parseInt(datePieces[0]);
                int day = Integer.parseInt(datePieces[1]);
                int year = Integer.parseInt(datePieces[2]);
                int hour = Integer.parseInt(timePieces[0]);
                int minute = Integer.parseInt(timePieces[1]);
                int second = Integer.parseInt(timePieces[2]);
                DateTime dt = new DateTime(new Date(day, month, year),
                        hour,minute,second,am);
                if (!DateTimeInvalidException.isValid(dt))
                    throw new DateTimeInvalidException(dt);
                dateTimes.add(dt);

            }catch (Exception exp){
                System.out.println(exp.getMessage());
                System.out.println("Please try again!");
            }
        }
        Collections.sort(dateTimes);
        for(DateTime dt: dateTimes)
            System.out.println(dt);
    }
}
