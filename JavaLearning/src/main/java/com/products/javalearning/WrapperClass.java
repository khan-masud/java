package com.products.javalearning;

public class WrapperClass {
    // Wrapper class is used to convert primitive data type to object and object to primitive data types
    public static void main(String[] args) {
        
            // Primitive Data Types
            int num = 100;
            char ch = 'A';
            double fee = 374.938;
            
            System.out.println("Primitive value : " + num + " " + ch + " " + fee);
            
            // Object or Wrapper Class
            Integer wInt = Integer.valueOf(num);
            Character wCh = Character.valueOf(ch);
            Double wFee = Double.valueOf(fee);
            
            System.out.println("The Objects : " + wInt + " " + wCh + " " + wFee);
            
            // Autoboxing
            Integer number = num; // same as Integer.valueOf(num)
            Character chartr = ch; // same as Integer.valueOf(ch)
            Double Fee = fee; // same as Integer.valueOf(fee)
            
            System.out.println("Objects (Autoboxing) : " + number + " " + chartr + " " + Fee);
            
            // Unboxing
            int uNum = number; 
            char uCh = chartr;
            double uFee = Fee;
            
            System.out.println("Primitive (Unboxing) : " + uNum + " " + uCh + " " + uFee);
            
    }
}
