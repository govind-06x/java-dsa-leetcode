class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int Maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        Maxsum = sum;
        int end = k;
        for (int i = 1; i <= nums.length - k; i++) {
            sum -= nums[i-1]; 
            sum+= nums[end];
            end++;
            Maxsum = Math.max(Maxsum, sum);
        }
        double ans = (double)Maxsum/k;
        return ans;
    }
}