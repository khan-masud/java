package com.products.javalearning;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create object for getting input
        String name;
        int roll;
        float cgpa;
        double attendance;
        String about;
        
        System.out.print("Enter your name : ");
        name = input.nextLine(); // Input name
        
        System.out.print("Enter about yourself : ");
        about = input.nextLine(); // Input about
        
        System.out.print("Enter your roll : ");
        roll = input.nextInt(); // Input roll
        
        System.out.print("Enter your CGPA : ");
        cgpa = input.nextFloat(); // Input CGPA
        
        System.out.print("Enter your attendance rate : ");
        attendance = input.nextDouble(); // Input attendance
        
        
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("CGPA : " + cgpa);
        System.out.println("Attendance : " + attendance);
        System.out.println("About : " + about);
    }
}
