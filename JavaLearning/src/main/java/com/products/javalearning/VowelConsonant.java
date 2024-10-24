
package com.products.javalearning;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        
        System.out.print("Enter a character : ");
        ch = input.next().charAt(0); // charAt for getting first letter of word
        
        if (ch == 'a' || ch == 'A') {
            System.out.println("This a vowel.");
        }
        if (ch == 'e' || ch == 'E') {
            System.out.println("This a vowel.");
        }
        if (ch == 'i' || ch == 'I') {
            System.out.println("This a vowel.");
        }
        if (ch == 'o' || ch == 'O') {
            System.out.println("This a vowel.");
        }
        if (ch == 'u' || ch == 'U') {
            System.out.println("This a vowel.");
        }
        else {
            System.out.println("This a consonant.");
        }
    }
}
