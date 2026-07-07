class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int[] fixed = new int[128];
        int[] freq = new int[128];
        int left = 0;
        int distinct = 0;
        String result = "";
        int min = s.length()+1;

        for (int i = 0; i < t.length(); i++) {
            fixed[t.charAt(i)]++;
        }
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(fixed[ch] > 0 && freq[ch] < fixed[ch]){
                distinct++;
            }
            freq[ch]++;
            while (distinct == t.length()) {
                if(min > right - left + 1){
                    min = right - left + 1;
                    result = s.substring(left,right+1);
                }
                char leftch = s.charAt(left);
                freq[leftch]--;
                if(fixed[leftch] > 0 && freq[leftch] < fixed[leftch]){
                    distinct--;
                }
                left++;
            }
        }
        return result;
    }
}