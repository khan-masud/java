package strings;

public class String2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Masud");
        str.append(" - Fucked up.");
        
        System.out.println("Whole String : " + str);
        System.out.println("Length : " + str.length());
        System.out.println("In Reverse : " + str.reverse());
        
        // StringBuilder of StringBuffer is almost same. 
        // These can be modified or changes
    }
}
