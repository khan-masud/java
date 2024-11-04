package SmallProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> ages = new ArrayList<>();
        
        int size;
        System.out.print("Enter Total Number Of Ages : ");
        size = input.nextInt();
        System.out.println("Input " + size + " Age : ");
        for (int i = 0; i < size; i++) {
            System.out.print(i+1 + "th Age : ");
            int age = input.nextInt();
            ages.add(i, age);
        }
        
        System.out.print("Array Of Age : ");
        for (int x : ages) {
            System.out.print(x + " ");
        }
        
        double sum = 0;
        for(int x : ages) {
            sum = sum + x;
        }
        System.out.println("\nThe Sum Of Ages : " + (int) sum);
        
        double avg = sum / size;
        System.out.println("The Average Of Ages : " + avg);
        
        double max = ages.get(0); 
        for (int i = 0; i < size; i++) {
            if(ages.get(i) > max) {
                max = ages.get(i);
            }
        }
        System.out.println("The Maximum Age : " + (int) max);
        
        double min = ages.get(0); 
        for (int i = 0; i < size; i++) {
            if(ages.get(i) < min) {
                min = ages.get(i);
            }
        }
        
        System.out.println("The Minimum Age : " + (int) min);
    }
}
