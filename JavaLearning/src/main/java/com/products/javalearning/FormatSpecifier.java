
package com.products.javalearning;

public class FormatSpecifier {
    public static void main(String[] args) {
        
        int int_number = 105;
        short short_number = 520; 
        float float_number = 523.5554f; 
        double double_number = 56463.8244437;
        char char_value = 'M';
        boolean bool_value = true;
        
        System.out.printf("Integer value : %d\n", int_number);
        System.out.printf("Short value : %d\n", short_number);
        System.out.printf("Float value : %.2f\n", float_number); // %.2f for printing 2 digit after decimal point
        System.out.printf("Double value : %.3f\n", double_number); // %.3f for printing 2 digit after decimal point
        System.out.printf("Character value : %c\n", char_value);  
        System.out.printf("Integer value : %b\n", bool_value);
        
        
    }
}
