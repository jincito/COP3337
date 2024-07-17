import java.util.Scanner;
import java.util.Stack;

public class Part2 {
    public static Scanner keyboard = new Scanner(System.in);
    public static Stack<Character> opens = new Stack<>();
    public static void main(String[] args) {
        System.out.println("Enter a seq. of parentheses: ");
        while(keyboard.hasNextLine()) {
            String input = keyboard.nextLine();
            if (isBalanced(input))
                System.out.println(input + " is balanced!");
            else
                System.out.println(input + " is not balanced!");
        }
    }

    public static boolean isBalanced(String input) {
        opens.clear(); // Empty stack at the beginning
        for (char c: input.toCharArray()) {
            if (c == '(')
                opens.push(c);
            else if (c == ')')
                if (opens.isEmpty()) // Always check if it is empty; exception
                    return false; // Unmatched closing parentheses
                else
                    opens.pop(); // Match opening to closing
        }
        return opens.isEmpty(); // If stack is not empty, too many opening parentheses
    }
}
