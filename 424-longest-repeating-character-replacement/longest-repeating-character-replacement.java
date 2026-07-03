class Solution {
    public int highest(int[] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int l = 0;
        int wl = 0;
        int[] count = new int[26];
        int max = 0;
        for(int r = 0; r < s.length() ; r++){
            count[s.charAt(r) - 'A']++;
            int currFreq =  count[s.charAt(r) - 'A'];
            max = Math.max(max,currFreq);
            while((r-l+1) - max > k){
                 count[s.charAt(l) - 'A']--;
                 l++;
                 max = highest(count);
            }
            wl = Math.max(r-l+1 , wl);
        }
        return wl;
    }
}