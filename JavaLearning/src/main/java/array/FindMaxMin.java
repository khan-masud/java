package array;

import java.util.Scanner;
public class FindMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size;
        System.out.println("Enter array size : ");
        size = input.nextInt();
        
        int [] array = new int[size];
        
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        
        //Find maximum
        int max = array[0]; // Set first element as max by default
        for (int i = 0; i < size; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        
        //Find minimum
        int min = array[0]; // Set first element as min by default
        for (int i = 0; i < size; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("The Maximum : " + max);
        System.out.println("The Minimum : " + min);
    }
}
