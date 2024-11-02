package SmallProject;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(;;) {
            int choose;
            System.out.println("Simple Calculator : ");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose operation : ");
            choose = input.nextInt();
            double num1, num2, result;

            if (choose == 1) {
                System.out.print("Enter first number : ");
                num1 = input.nextDouble();
                System.out.print("Enter second number : ");
                num2 = input.nextDouble();

                result = (num1 + num2);
                System.out.println("The Addition : " + result);

            }
            else if (choose == 2) {
                System.out.print("Enter first number : ");
                num1 = input.nextDouble();
                System.out.print("Enter second number : ");
                num2 = input.nextDouble();

                result = (num1 - num2);
                System.out.println("The Substraction : " + result);
            }
            else if (choose == 3) {
                System.out.print("Enter first number : ");
                num1 = input.nextDouble();
                System.out.print("Enter second number : ");
                num2 = input.nextDouble();

                result = (num1 * num2);
                System.out.println("The Multiplication : " + result);
            }
            else if (choose == 4) {
                System.out.print("Enter first number : ");
                num1 = input.nextDouble();
                System.out.print("Enter second number : ");
                num2 = input.nextDouble();

                result = (num1 / num2);
                System.out.println("The Addition : " + result);
            }
            else if (choose == 5) {
                System.out.println("Existing the program...");
                System.out.println("Develped by : Abdullah Al Masud");
                break;
            }
        }
        
    }
}
