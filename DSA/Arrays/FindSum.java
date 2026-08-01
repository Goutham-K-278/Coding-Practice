class Solution {
    // This function should return the total sum of all integers in the array.
    public int findSum(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}

public class FindSum {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: 150");
        
        Solution sol = new Solution();
        int result = sol.findSum(myArray);
        
        System.out.println("Actual:   " + result);
    }
}
