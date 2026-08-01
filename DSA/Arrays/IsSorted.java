class Solution {
    // This function should return true if the array is sorted in ascending order (smallest to largest),
    // and false if it is not sorted.
    public boolean isSorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true; 
    }
}

public class IsSorted {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50};
        int[] unsortedArray = {10, 20, 50, 40, 30};
        
        Solution sol = new Solution();
        
        System.out.println("Testing the Solution:");
        System.out.println("Array 1 Expected: true");
        System.out.println("Array 1 Actual:   " + sol.isSorted(sortedArray));
        
        System.out.println("\nArray 2 Expected: false");
        System.out.println("Array 2 Actual:   " + sol.isSorted(unsortedArray));
    }
}
