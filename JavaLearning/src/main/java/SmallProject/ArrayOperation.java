package SmallProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> array = new ArrayList<>();
        
        int size;
        System.out.print("Enter total number of elements : ");
        size = input.nextInt();
        System.out.println("Input " + size + " number : ");
        for (int i = 0; i < size; i++) {
            System.out.print(i+1 + "th elements : ");
            int number = input.nextInt();
            array.add(i, number);
        }
        
        System.out.print("Array : ");
        for (int x : array) {
            System.out.print(x + " ");
        }
        
        double sum = 0;
        for(int x : array) {
            sum = sum + x;
        }
        System.out.println("\nThe sum of array elements : " + sum);
        
        double avg = sum / size;
        System.out.println("The average : " + avg);
        
        double max = array.get(0); 
        for (int i = 0; i < size; i++) {
            if(array.get(i) > max) {
                max = array.get(i);
            }
        }
        System.out.println("The maximum : " + max);
        
        double min = array.get(0); 
        for (int i = 0; i < size; i++) {
            if(array.get(i) < min) {
                min = array.get(i);
            }
        }
        
        System.out.println("The minimum : " + min);
    }
}
