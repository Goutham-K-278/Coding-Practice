class Solution {
    // This function should return the middle element of the array.
    public int findMiddle(int[] arr) {
        int middle = arr.length/2;
        
        return arr[middle]; // Placeholder so the code compiles
    }
}

public class FindMiddle {
    public static void main(String[] args) {
        int[] oddArray = {10, 20, 30, 40, 50}; // Length is 5
        int[] evenArray = {10, 20, 30, 40};    // Length is 4
        
        Solution sol = new Solution();
        
        System.out.println("Testing the Solution (Odd Length):");
        System.out.println("Expected: 30"); 
        System.out.println("Actual:   " + sol.findMiddle(oddArray));
        
        System.out.println("\nTesting the Solution (Even Length):");
        System.out.println("Expected: 30"); // Usually we take the right-middle for even arrays
        System.out.println("Actual:   " + sol.findMiddle(evenArray));
    }
}
