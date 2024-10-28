package array;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        System.out.println("Array Size Before Intializing : " + number.size());
        
        // Add elements
        number.add(10);
        number.add(20);
        number.add(30);
        
        System.out.println("ArrayList Items : " + number);
        
        number.add(3, 40); // Add elements by index. 3 is index and 40 is value
        number.add(1, 50);// Add element in 0 index
        
        System.out.println("ArrayList Items : " + number);
        
        //Get method
        int FirstElement = number.get(0); // Get element of 0 index
        int SecondElement = number.get(2); // Get element of 2 index
        int LastElement = number.get(number.size()-1); // Get the last element
        
        System.out.println(FirstElement);
        System.out.println(SecondElement);
        System.out.println(LastElement);
        
        // Set method
        number.set(1, 60); // Change or replace element in index 1 
        number.set(2, 70); // Change or replace element in index 2
        
        System.out.println("ArrayList Items : " + number);
        
        // Remove method
        number.remove(0); // Remove the element of index 0
        number.remove(1); // Remove the element of index 1 (70)
        
        System.out.println("ArrayList Items : " + number);
        
        number.clear(); // Clear the ArrayList
        
        System.out.println("ArrayList Items : " + number);
    }
}
