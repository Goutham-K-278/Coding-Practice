class Solution {
    // This function should reverse the array without creating a new array, and then return it.
    public int[] reverseInPlace(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int temp = 0;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr; 
    }
}

public class ReverseInPlace {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        
        System.out.println("Testing the Solution:");
        System.out.print("Expected: [50, 40, 30, 20, 10]\nActual:   [");
        
        Solution sol = new Solution();
        int[] result = sol.reverseInPlace(myArray); // Save the returned array
        
        // Print the array after reversing
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
