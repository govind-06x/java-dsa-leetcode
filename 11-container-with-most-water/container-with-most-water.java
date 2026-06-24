class Solution {
    public int maxArea(int[] arr) {
        int maxWater = Integer.MIN_VALUE;
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            int height = Math.min(arr[i], arr[j]);
            int area = height*(j-i);
            maxWater = Math.max(maxWater, area);
            if(arr[i] > arr[j]) j--;
            else i++;
        }


        return maxWater;
    }
}