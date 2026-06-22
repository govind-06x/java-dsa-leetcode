class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        for(int j = 1;j<nums.length;j++){
            if(nums[j] != nums[j-1]){
                nums[left] = nums[j];
                left++;
            }
        }
        return left;
    }
}