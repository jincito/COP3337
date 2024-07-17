package driver;

public class Question2 {
    public static boolean checkString(String input) {
        if (!Character.isUpperCase(input.charAt(0)))
            return false;
        for(char c : input.toCharArray())
            if(!Character.isLetter(c))
                return false;
        return true;
    }
}
