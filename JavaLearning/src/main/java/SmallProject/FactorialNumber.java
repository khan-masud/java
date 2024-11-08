package SmallProject;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number for factorial : ");
        int number = input.nextInt();
        
        // Call method for factorial and pass value of number
        factorial(number);
    }
    
    public static void factorial (int number) {
        int fact = 1; // Initialize of fact variable
        
        for (int i = number; i >= 1; i--) {
            fact = fact * i;
        }
        
        System.out.print("The factorial of " + number + " : " + fact);
    }
}
