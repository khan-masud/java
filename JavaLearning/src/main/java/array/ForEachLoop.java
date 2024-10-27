package array;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter array size : ");
        size = input.nextInt();
        
        String [] array = new String[size];
        
        System.out.println("Enter " + size + " names : ");
        for (int i = 0; i < size; i++) {
            array[i] = input.next(); // Input separeting by whitespace
        }
        
        // For each loop
        System.out.print("Names are : ");
        for (String x : array) {
            System.out.print(x + " ");
        }
    }
}
