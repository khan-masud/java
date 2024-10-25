
package com.products.javalearning;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, sum = 0;
        
        System.out.println("Enter n number : ");
        num = input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        
        System.out.println("Sum of 1 to " + num + " is : " + sum);
    }
}
