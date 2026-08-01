class Solution {
    // This function should return the largest integer found in the array.
    public int findMax(int[] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

public class FindMax {
    public static void main(String[] args) {
        int[] myArray = {12, 45, 7, 89, 23};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: 89");
        
        Solution sol = new Solution();
        int result = sol.findMax(myArray);
        
        System.out.println("Actual:   " + result);
    }
}
