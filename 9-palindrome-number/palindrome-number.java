class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int ans = 0;
        if(x<0) return false;
        while(original > 0){
            ans = (ans*10) + (original %10);
            original /= 10;
        }
        return x == ans;
    }
}