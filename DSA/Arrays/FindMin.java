class Solution {
    // This function should return the smallest integer found in the array.
    public int findMin(int[] arr) {
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}

public class FindMin {
    public static void main(String[] args) {
        int[] myArray = {12, 45, 7, 89, 23};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: 7");
        
        Solution sol = new Solution();
        int result = sol.findMin(myArray);
        
        System.out.println("Actual:   " + result);
    }
}
