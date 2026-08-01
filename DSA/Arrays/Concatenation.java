class Solution {
    // This function should return an array that is the concatenation of two nums arrays.
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] sum = new int[2*n];
        for(int i=0; i<n; i++){
            sum[i] = nums[i];
            sum[i+n] = nums[i];
        }
        
        return sum;
    }
}

public class Concatenation {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        int[] nums2 = {1, 3, 2, 1};
        
        Solution sol = new Solution();
        
        System.out.println("Testing the Solution:");
        
        // Test Case 1
        System.out.print("Expected 1: [1, 2, 1, 1, 2, 1]\nActual 1:   [");
        int[] result1 = sol.getConcatenation(nums1);
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + (i < result1.length - 1 ? ", " : ""));
        }
        System.out.println("]\n");
        
        // Test Case 2
        System.out.print("Expected 2: [1, 3, 2, 1, 1, 3, 2, 1]\nActual 2:   [");
        int[] result2 = sol.getConcatenation(nums2);
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + (i < result2.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
