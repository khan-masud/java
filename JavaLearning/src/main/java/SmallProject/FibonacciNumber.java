package SmallProject;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter number for fibonacci : ");
        number = input.nextInt();
        
        // Call the fibonacci method and pass number
        fibonacci(number);
    }
    
    public static void fibonacci(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;
        
        System.out.print("The fibonacci series of " + number + " : ");
        for (int i = 1; i <= number; i++) {
            System.out.print(firstNumber + " ");
            
            // Update the series
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
