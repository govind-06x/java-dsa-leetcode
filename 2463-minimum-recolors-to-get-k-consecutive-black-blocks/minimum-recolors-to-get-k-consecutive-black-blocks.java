class Solution {
    public int minimumRecolors(String blocks, int k) {
        int Wcount = 0;
        for (int i = 0; i < k; i++) {
            if(blocks.charAt(i) == 'W') Wcount++;
        }
        int MinSum = Wcount;
        int end = k;
        for (int i = 1; i <= blocks.length() - k; i++) {
            if(blocks.charAt(i-1) == 'W') Wcount--;
            if(blocks.charAt(end)== 'W') Wcount++;
            MinSum = Math.min(MinSum, Wcount);
            end++;
        }
        return MinSum;
    }
}