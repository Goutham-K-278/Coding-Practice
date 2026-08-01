class Solution {
    // This function should return the second smallest integer found in the array.
    // You can assume the array has at least 2 different numbers.
    public int findSecondMin(int[] arr) {
        // TODO: Write your logic here!
        int firstmin = Math.min(arr[0],arr[1]);
        int secmin = Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]<firstmin){
                secmin = firstmin;
                firstmin = arr[i];
            }
            else if(arr[i]<secmin){
                secmin=arr[i];
            }
        }

        
        return secmin; // Placeholder so the code compiles
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
