class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 1;
        int freq = 1;
        for(int i = 1 ; i < nums.length;i++){
            if(nums[i] == nums[i-1]){
                freq++;
            }
            else{
                freq = 1;
            }
            if(freq <=2){
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }
}