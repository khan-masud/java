
package com.products.javalearning;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter a integer number : ");
        num = input.nextInt();
        
        if (num > 0) {
            System.out.println("This is a positive number");
        }
        else if (num < 0) {
            System.out.println("This in a negative number");
        }
        else {
            System.out.println("This is zero");
        }
        
    }
}
