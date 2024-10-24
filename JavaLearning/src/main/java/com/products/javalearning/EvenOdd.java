
package com.products.javalearning;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer number : ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("This is even number");
        }
        else {
            System.out.println("This is odd number");
        }
        
    }
}
