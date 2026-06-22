class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            if(!dig(s.charAt(left))){
                left++;
            }
               else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    // Verifies digit or not
      static boolean dig(char ch){
        return ((ch>=48 && ch <=57) || (ch>=97 && ch<=122));
    }
}