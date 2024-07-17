import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static final String INPUT_PATH = System.getProperty("user.dir") + "/input/";//"C:\\Users\\kgholami\\IdeaProjects\\DF5 SU24 COP3337\\input";
    public static void main(String[] args){
        File inputFile = new File(INPUT_PATH + "input.txt");
        //creates a File object representing the file with name input.txt inside
        //the INPUT directory!
        //File outputFile = new File(INPUT_PATH + "input.txt");
        //creates a File object representing the file with name output.txt inside
        //the OUTPUT directory!
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Input file " + inputFile + " either does not exist" +
                    " OR it cannot be opened b/c you have no permission!");
            System.exit(1);
        }
        //read the file using Scanner...
        /**/
        ArrayList<String>fileContent = new ArrayList<>();
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();//read one line from input file
            String updatedLine = line.toLowerCase();
            fileContent.add(updatedLine);
        }
        fileScanner.close();
        //release the LOCK on the inputfile!

        File outputFile = new File(INPUT_PATH + "input.txt");
        PrintWriter out = null;
        try {
            out = new PrintWriter(outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Output file " + outputFile + " either cannot be overwritten" +
                    " OR it cannot be created!");
            System.exit(2);
        }
        for(int i = 0; i < fileContent.size();i++){
            if(i == fileContent.size() - 1)
                out.print(fileContent.get(i));
            else
                out.println(fileContent.get(i));
        }
        out.flush();//moves the remaining out buffer content to the file system...
        out.close();
    }
}
