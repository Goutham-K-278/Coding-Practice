class Solution {
    // This function should return the second largest integer found in the array.
    // You can assume the array has at least 2 different numbers.
    public int findSecondMax(int[] arr) {
        int fmax = Math.max(arr[1],arr[0]);
        int smax = Math.min(arr[1],arr[0]);
        for(int i=2; i<arr.length; i++){
            if(arr[i]>fmax){
                smax=fmax;
                fmax=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
        }
        return smax;
        
        // Placeholder so the code compiles
    }
}

public class SecondMax {
    public static void main(String[] args) {
        int[] myArray = {12, 35, 1, 10, 34, 1};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: 34");
        
        Solution sol = new Solution();
        int result = sol.findSecondMax(myArray);
        
        System.out.println("Actual:   " + result);
    }
}
