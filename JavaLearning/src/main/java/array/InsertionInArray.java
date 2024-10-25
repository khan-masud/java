package array;

import java.util.Scanner;

public class InsertionInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];
        
        System.out.print("Enter 5 integer : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
        System.out.print("Elements of array : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
