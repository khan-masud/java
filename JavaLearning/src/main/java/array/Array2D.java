package array;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter row of array : ");
        int row = input.nextInt();
        System.out.println("Enter column of array : ");
        int column = input.nextInt();
        
        
        // Declare 2D array
        int [][] array = new int[row][column];
        
        // Take input of 2d array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter value of array ");
                System.out.print("[" + i + "][" + j + "] : ");
                array[i][j] = input.nextInt();
            }
        }
        
        // Print the array
        for(int [] values : array) {
            for (int value : values) {
                System.out.print(" " + value);
            }
        }
    }
}
