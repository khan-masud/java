package array;

import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size, sum = 0;
        System.out.println("Enter array size : ");
        size = input.nextInt();
        int [] numbers = new int[size];
        
        // Loop for inserting array of elements
        System.out.println("Enter " + size + " integer : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }
        
        // Loop for calculating sum
        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
        }
        
        double avg = (double) sum / size; // Type casting
        
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + avg);
    }
}
