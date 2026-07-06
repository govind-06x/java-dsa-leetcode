class Solution {
    public int good(int[] arr , int k){
        if(k==0) return 0;
        int left = 0;
        int count = 0;
        int distinct = 0;
        int[] freq = new int [arr.length + 1];
        for(int r = 0 ; r < arr.length ; r++){
            if(freq[arr[r]] == 0){
                distinct++;
            }
            freq[arr[r]]++;
            while(distinct > k){
                freq[arr[left]]--;
                if(freq[arr[left]] == 0){
                    distinct--;
                } 
                left++;
            }

            count += r - left + 1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return good(nums,k) - good(nums,k-1);
    }
}