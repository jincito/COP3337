import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Question1 {
    public static final String INPUT_PATH = System.getProperty("user.dir") + "/input/";//"C:\\Users\\kgholami\\IdeaProjects\\DF5 SU24 COP3337\\input";
    public static final String OUTPUT_PATH = System.getProperty("user.dir") + "/output/";//"C:\\Users\\kgholami\\IdeaProjects\\DF5 SU24 COP3337\\input";
    public static void main(String[] args){
        File inputFile = new File(INPUT_PATH + "input.txt");
        //creates a File object representing the file with name input.txt inside
        //the INPUT directory!
        File outputFile = new File(OUTPUT_PATH + "output.txt");
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
        PrintWriter out = null;
        try {
            out = new PrintWriter(outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Output file " + outputFile + " either cannot be overwritten" +
                    " OR it cannot be created!");
            System.exit(2);
        }
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();//read one line from input file
            String updatedLine = line.toLowerCase();
            if(fileScanner.hasNextLine())
                out.println(updatedLine);
            else
                out.print(updatedLine);
        }
        fileScanner.close();
        out.flush();//moves the remaining out buffer content to the file system...
        out.close();
    }
}
