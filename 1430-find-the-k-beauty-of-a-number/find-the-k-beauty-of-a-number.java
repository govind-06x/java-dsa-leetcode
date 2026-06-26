class Solution {
    public int divisorSubstrings(int num, int k) {
        int tenpow = (int)Math.pow(10,k);
        int original = num;
        int n = (int)Math.log10(num) + 1;
        int count = 0;
        int noOfTimes = n-k+1;
        while(noOfTimes>0)
       {
            int rem = num % tenpow;
            if(rem !=0 && original% rem == 0) count++;
            num /= 10;
            noOfTimes--;
       }
       return count;
    }
}