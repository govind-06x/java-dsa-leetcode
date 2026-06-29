class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int zeroCount = 0;
        int Maxones = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[i] == 0) {
                    zeroCount--;
                }
                i++;
            }
            Maxones = Math.max(Maxones,j-i+1);
        }
        return Maxones;
    }
}