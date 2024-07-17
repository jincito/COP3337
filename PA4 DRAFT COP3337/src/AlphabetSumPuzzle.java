import java.util.ArrayList;
import java.util.Scanner;

public class AlphabetSumPuzzle {
    private static ArrayList<Character> variables = new ArrayList<>();//all variables in the puzzle
    private static ArrayList<String>operands = new ArrayList<>();//all sum operands given by keyboard
    private static String result = null;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        while(keyboard.hasNextLine()){
            String puzzle = keyboard.nextLine();
            String[] tokens = puzzle.split("[^a-zA-Z]");

            for(int i = 0; i < tokens.length-1;i++)
                if(tokens[i].length() != 0)
                    operands.add(tokens[i]);//all tokens but the last one represent the sum operands
            result = tokens[tokens.length-1];//last token must be the sum result
            int[] digitValues = new int[256];//maps characters to digits
            for(int i = 0; i < 256;i++)//initialize digitValues to -1
                digitValues[i] = -1;//symbol for empty cell!
            findAllVariables(puzzle);//detect every character participating in the puzzle and store it in the list of variables
            //solve method is called here

            //simlar to solve method, we call this method for DF#8
            printAllCombinations(digitValues);


            //testing numericalValue method...
            digitValues['T'] = 1;
            digitValues['H'] = 2;
            digitValues['E'] = 3;
            System.out.println("This is an example: Numerical value of " +
                    "THE is " +
                    numericalValue("THE", digitValues));
        }
    }

    private static void findAllVariables(String puzzle) {
        variables.clear();
        for(char c: puzzle.toCharArray())
            if(Character.isLetter(c) && !variables.contains(c))
                variables.add(c);
    }

    private static int numericalValue(String word, int[] digitValues) {
        int rv = 0;
        for(char c: word.toCharArray())
            if(digitValues[c] < 0)//if c is not assigned to any value
                return -1;//error
            else
                rv = 10 * rv + digitValues[c];
        return rv;
        /* SLOW solution
        int power = word.length()-1;
        for(char c: word.toCharArray())
            if(digitValues[c] < 0)//if c is not assigned to any value
                return -1;//error
            else
                rv += Math.pow(10, power--) * digitValues[c];
        return rv;
        */
    }

    //THE: 3-digit integer
    //numerical value = T * 100 + H * 10 + E * 1
    // 1 * E + 10 * H + 100 * T
    // 1 * E + 10 * (H + 10 * T)

    private static void printAllCombinations(int[] digitValues){
        //base case: if all variables are assigned to digits from 0-9,
        // don't call the method recursively anymore!
        boolean incompleteAssignment = false;
        char unassignedVariable = 0;
        for(char variable: variables)
            if(digitValues[variable] == -1) {//found an unassigned char
                incompleteAssignment = true;
                unassignedVariable = variable;
                break;
            }
        if(!incompleteAssignment) {//complete assignment
            printCombination(digitValues);
            return;
        }
        //recursive step:
        //1. find an unassigned variable
        //already done: unassignedVariable!
        //2. assign that variable to digits 0, 1, ..., 9 in for loop
        for(int i = 0; i < 10; i++) {
            digitValues[unassignedVariable] = i;
            //2.1. after the assignment, call the method recursively
            printAllCombinations(digitValues);
        }
        //3. after step 2, assign the variable to -1 again...
        digitValues[unassignedVariable] = -1;
    }

    private static void printCombination(int[] digitValues) {
        for(char variable: variables)
            System.out.printf("%c: %d|", variable,
                    digitValues[variable]);
        System.out.println();
    }

}