package SmallProject;
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean prime;
        System.out.print("Enter maximum limit : ");
        int limit = input.nextInt();
        
        for (int i = 2; i <= limit; i++) {
            prime = true;
            
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }
            
            if(prime) {
                System.out.println(i + " is prime.");
            } else {
                System.out.println(i + " is not prime.");
            }
        }
    }
}
