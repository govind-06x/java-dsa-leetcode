class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;int window = 0;
        boolean[] arr = new boolean[256];
        for(int right = 0 ; right < s.length() ; right++){
            int index = (int)s.charAt(right);
            if(arr[index]){
                while(arr[index]){
                    arr[(int)s.charAt(left)] = false;
                    left++;
                }
            }
            arr[index] = true;
            window = Math.max(window,right-left+1);
        }
        return window;
    }
}