package driver;

import java.util.Scanner;

public class Question3 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String line;
        while(true){
            line = keyboard.nextLine();
            if(line.equals("end"))
                break;
            String[] tokens = line.split(" "); // Tokenization - splitting word
            int i = 0;
            for(String token : tokens)
                System.out.printf("%d: %s ", ++i, token);
            System.out.println();
        }
    }
}
