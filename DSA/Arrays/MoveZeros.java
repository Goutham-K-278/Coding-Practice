class Solution {
    public int[] moveZeros(int[] arr) {
        int w = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[w] = arr[i];
                w++;
            }
        }
        while(w < arr.length){
            arr[w] = 0;
            w++;
        }
        return arr;
    }
}


public class MoveZeros {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 0, 3, 12};
        
        Solution sol = new Solution();
        
        System.out.println("Testing the Solution:");
        System.out.print("Expected: [1, 3, 12, 0, 0]\nActual:   [");
        
        int[] result = sol.moveZeros(myArray);
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
