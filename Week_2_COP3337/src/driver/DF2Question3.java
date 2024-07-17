/*
Name: Jin Carballosa
Discussion 1
5/14/24
 */

package driver;

public class DF2Question3 {
    public static boolean checkScore(String input){
        //Check #1
        for (int i = 0; i < input.length(); i++)
            if(!Character.isDigit(input.charAt(i)))
                return false;

        //Check #2
        for(char c:input.toCharArray())
            if (!Character.isDigit(c))
                return false;

        //Check #3
        if(!input.matches("[0-9]*"))
            return false;

        int value = Integer.parseInt(input); //converts String to Int
        return value >= 0 && value <= 100;
    }
    public static void main(String[] args) {
        System.out.println(checkScore("9.0"));
    }
}
