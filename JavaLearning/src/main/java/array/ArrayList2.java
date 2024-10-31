package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList <> ();
        Scanner input = new Scanner(System.in);
        
        // Add data by user input in ArrayList
        System.out.print("Add 5 elements in Array List : ");
        for (int i = 0; i < 5; i++) {
            numbers.add(input.nextInt()); // add method
        }
        
        System.out.println(numbers);
    }
}
