class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int right = 0;
        int left = cardPoints.length-k;
        int maxSum = 0;
        int sum = 0;
        for (int l = left; l < cardPoints.length; l++) {
            sum += cardPoints[l];
        }
        maxSum = sum;
        while (k>0) {
            sum -= cardPoints[left];
            sum += cardPoints[right];
            right++;
            left++;
            k--;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}