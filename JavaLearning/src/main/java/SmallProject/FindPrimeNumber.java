package SmallProject;
import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        boolean prime;
        
        for (int i = 2; i <= 100; i++) {
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
