package strings;

public class StringConversation {
    public static void main(String[] args) {
        int num = 100000;
        float cgpa = 3.99f;
        double fee = 38749.987;
        boolean fuckedUp = true;
        System.out.println("Primitive value : " + num + " " + cgpa + " " + fee + " " + fuckedUp);

        // Integer to String
        String stringInteger = Integer.toString(num); // toString method
        System.out.println("String value of num : " + stringInteger);
        
        // Float to String
        String stringFloat = Float.toString(cgpa);
        System.out.println("String value of cgpa : " + stringFloat);
        
        // Double to String
        String stringDouble = Double.toString(fee);
        System.out.println("String value of fee : " + stringDouble);
        
        // Boolean to String
        String stringBool = Boolean.toString(fuckedUp);
        System.out.println("String value of fuckedUp : " + stringBool);
        
        // String to Integer 
        int integer = Integer.parseInt(stringInteger);
        // int integer = Integer.valueOg(stringInteger);
        System.out.println("After parsing integer : " + integer);
        
        // String to Float 
        float floating = Float.parseFloat(stringFloat);
        System.out.println("After parsing float : " + floating);
        
        // String to Double
        double doubleValue = Double.parseDouble(stringDouble);
        System.out.println("After parsing double : " + doubleValue);
        
        // String to Boolean
        boolean bool = Boolean.parseBoolean(stringBool);
        System.out.println("After parsing boolean : " + bool);
    }
}
