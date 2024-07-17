package driver;

public class DF2Question4 {
    public static boolean checkPID(String input){
        if(!input.matches("[0-9]*"))
            return false;
        return input.length() == 7;
    }
}
