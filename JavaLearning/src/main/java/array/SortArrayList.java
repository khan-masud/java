package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList <> ();
        
        // Input elements of ArryList
        System.out.print("Enter 7 elements for ArrayList : ");
        for (int i = 0; i < 7; i++) {
            numbers.add(input.nextInt());
        }
        
        // Print unsorted ArrayList
        System.out.println("Unsorted Array List : " + numbers);
        
        // Sort ArrayList in accending order
        Collections.sort(numbers);
        
        // Print sorted ArrayList
        System.out.println("Sorted ArrayList (Accending) : " + numbers);
        
        // Sort ArrayList in deccending order
        Collections.sort(numbers, Collections.reverseOrder());
        
        // Print deccending order sorted ArrayList
        System.out.println("Sorted ArrayList (Deccending) : " + numbers);
    }
}
