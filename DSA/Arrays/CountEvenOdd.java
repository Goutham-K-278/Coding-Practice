class Solution {
    // This function should return an array where index 0 is the count of evens, and index 1 is the count of odds.
    public int[] countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        return new int[]{even,odd};
    }
}

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] myArray = {12, 45, 7, 88, 23, 10};
        
        System.out.println("Testing the Solution:");
        System.out.println("Expected: [3, 3]");
        
        Solution sol = new Solution();
        int[] result = sol.countEvenOdd(myArray);
        System.out.println("Actual:   [" + result[0] + ", " + result[1] + "]");
    }
}
