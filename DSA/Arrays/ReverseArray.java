

class Solution {
    // This is the function you need to complete!
    // It takes an integer array called 'arr' as input (a parameter)
    public void printReverse(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}

public class ReverseArray {
    public static void main(String[] args) {
        // This is our test data
        int[] myArray = {10, 20, 30, 40, 50};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: 50 40 30 20 10");
        System.out.print("Actual:   ");
        
        // 1. We create an object (an instance) of the Solution class
        Solution sol = new Solution();
        
        // 2. We call the function and pass our array into it
        sol.printReverse(myArray);
        
        System.out.println(); // Just to print a new line at the very end    
    }
}
