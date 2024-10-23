package com.products.javalearning;
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        int num1, num2, result;
        double divide_result;
        
        System.out.print("Enter first number : ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number : ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Addition : " + result);
        
        result = num1 - num2;
        System.out.println("Substraction : " + result);
        
        result = num1 * num2;
        System.out.println("Multiplication : " + result);
        
        divide_result = num1 / (double) num2;
        System.out.println("Division : " + divide_result);
        
        result = num1 % num2;
        System.out.println("Remainder : " + result);
        
        
    }
}
