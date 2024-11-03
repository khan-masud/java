package SmallProject;

import java.util.Scanner;

public class Array2DSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input for array 1
        System.out.print("Enter total number of elements of 1st array: ");
        int array1_size = input.nextInt();
        int[] array1 = new int[array1_size];
        System.out.println("Enter values of array 1: ");
        for (int i = 0; i < array1_size; i++) {
            System.out.print("Value of number " + (i + 1) + ": ");
            array1[i] = input.nextInt();
        }

        // Input for array 2
        System.out.print("Enter total number of elements of 2nd array: ");
        int array2_size = input.nextInt();
        int[] array2 = new int[array2_size];
        System.out.println("Enter values of array 2: ");
        for (int i = 0; i < array2_size; i++) {
            System.out.print("Value of number " + (i + 1) + ": ");
            array2[i] = input.nextInt();
        }

        // Input for array 3
        System.out.print("Enter total number of elements of 3rd array: ");
        int array3_size = input.nextInt();
        int[] array3 = new int[array3_size];
        System.out.println("Enter values of array 3: ");
        for (int i = 0; i < array3_size; i++) {
            System.out.print("Value of number " + (i + 1) + ": ");
            array3[i] = input.nextInt();
        }

        // Initializing the main 2D array (array of arrays)
        int[][] array = {{array1}, {array2}, {array3}};
        
        int [][] array = {{1,3,4},{4,6,7,5},{9,5}};

        // Displaying the arrays
        System.out.println("The arrays are: ");
        for(int[] x : array) {
            for (int y : x) {
                System.out.println(y + " ");
            }
            System.out.println("");
        }
    }
}
