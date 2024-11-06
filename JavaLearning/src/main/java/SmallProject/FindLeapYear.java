package SmallProject;
import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        if ((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) 
        {
            System.out.println("This is leap year.");
        }
        else {
            System.out.println("This is not leap year.");
        }
    }
}
