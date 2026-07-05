class Solution {
     public int nice(int[] arr, int k){
        int left = 0;
        int count = 0;
        int oddCount = 0;
        for(int right = 0 ; right < arr.length ; right++){
            oddCount += arr[right] % 2 == 1 ? 1:0;
            while(oddCount > k){
                oddCount -= arr[left] % 2 == 1 ? 1:0;
                left++;
            }
            count += right-left+1;
        }
        return count;
     }
    public int numberOfSubarrays(int[] nums, int k) {
        return nice(nums, k) - nice(nums, k-1);
    }
}