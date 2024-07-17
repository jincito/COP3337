package driver;

import java.util.ArrayList;

public class Question4 {
    public static int[][] squareShapeArray = new int[5][5];

    public static void main(String[] args) {
        int counter = 1;
        for(int column = 0; column < 5; column++) {
            for(int row = 0; row < 5; row++) {
                squareShapeArray[row][column] = counter++;
            }
        }
        //without enhanced for loop
        for(int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                System.out.print(squareShapeArray[row][column]);
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();

        //with enhanced for loop!
        for(int[] row: squareShapeArray) {
            for(int cell: row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
