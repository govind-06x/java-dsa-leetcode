class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0, oneCount = 0, twoCont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else if (nums[i] == 1) {
                oneCount++;
            } else {
                twoCont++;
            }
        }
        oneCount += zeroCount;
        twoCont += oneCount;
        change(nums,0,zeroCount,0);
        change(nums,zeroCount,oneCount,1);
        change(nums,oneCount,twoCont,2);
    }
     private static void change(int[] nums, int st, int end, int val) {
        for (int j2 = st; j2 < end; j2++) {
            nums[j2] = val;
        }
    }
}