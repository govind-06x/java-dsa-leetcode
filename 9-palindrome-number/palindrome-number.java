class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        if(x % 10 == 0) return false;
        int original = x;
        int ans = 0;
       
        while(original > 0){
            ans = (ans*10) + (original %10);
            original /= 10;
        }
        return x == ans;
    }
}