package strings;

public class Strings1 {
    public static void main(String[] args) {
        String text1 = "Abdullah Al Masud";
        String text2 = "The Offline Dreamer";
        String text3 = "Masud";
        String text4 = text1 + text2 + text3;
        String text5 = "Hello this is Masud. I fucked up in my life many times because of my emotions. I don't know what is my future.";
        
        // Length
        System.out.println("Length of Text 4 : " + text4.length());
        
        System.out.println("text1 in uppercase : " + text1.toUpperCase());
        System.out.println("text2 in lowercase : " + text2.toLowerCase());
        
        int compare = text1.compareTo(text2);
        System.out.println("Compare text1 and text2 : " + compare);
    }
}
