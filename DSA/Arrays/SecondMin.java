class Solution {
    // This function should return the second smallest integer found in the array.
    // You can assume the array has at least 2 different numbers.
    public int findSecondMin(int[] arr) {
        int fmin = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < fmin){
                smin = fmin;
                fmin = arr[i];
            }else if(arr[i] < smin){
                smin = arr[i];
            }
        }
        

        
        return smin;// Placeholder so the code compiles
    }
}

public class SecondMin {
    public static void main(String[] args) {
        int[] myArray = {12, 35, 1, 10, 34, 2};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: 2"); // 1 is min, 2 is second min
        
        Solution sol = new Solution();
        int result = sol.findSecondMin(myArray);
        
        System.out.println("Actual:   " + result);
    }
}
