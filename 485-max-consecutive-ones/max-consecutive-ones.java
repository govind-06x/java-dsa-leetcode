class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int maxCount = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != 1) i = j+1;
            maxCount = Math.max(maxCount,j-i+1);
        }
        return maxCount;
    }
}