import java.util.Arrays;

class Solution {
    public int numRescueBoats(int[] arr, int limit) {
      
        Arrays.sort(arr);
        
        int boats = 0;
        int i = 0;                 
        int j = arr.length - 1;   
        
        
        while (i <= j) {
            boats++;
            
           
            if (arr[i] + arr[j] <= limit) {
                i++;
            }
            
           
            j--;
        }
        
        return boats;
    }
}