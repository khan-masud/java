package SmallProject;

public class Array2DSum {
    public static void main(String[] args) {
        
        int [][] array = {{5,3,10},{4,25,57,2},{11,4}};
        
        // Sum of whole array
        int wholeArraySum = 0;
        for(int [] x : array) {
            for(int y : x) {
                wholeArraySum = y + wholeArraySum;
            }
        }
        System.out.println("The Whole Array Sum : " + wholeArraySum);
        
        // Sum of 1st array 
        int array1Sum = 0;
        for(int x : array[0]) {
            array1Sum = array1Sum + x;
        }
        System.out.println("Sum Of 1st Array : " + array1Sum);
        
        // Sum of 2nd array 
        int array2Sum = 0;
        for(int x : array[1]) {
            array2Sum = array2Sum + x;
        }
        System.out.println("Sum Of 1st Array : " + array2Sum);
        
        // Sum of 3rd array 
        int array3Sum = 0;
        for(int x : array[2]) {
            array3Sum = array3Sum + x;
        }
        System.out.println("Sum Of 1st Array : " + array3Sum);
        
        // Check even or odd of sum
        int [] arrayOfSum = {wholeArraySum, array1Sum, array2Sum, array3Sum};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arrayOfSum.length; i++) {
            if(arrayOfSum[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Number Of Even Sum : " + even);
        System.out.println("Number Of Odd Sum : " + odd);
    }
}
