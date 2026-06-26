class Solution {
    public int maximumLengthSubstring(String s) {
        int windowSize = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        int count[] = new int[26];

        while (right < n) {
            int index = s.charAt(right) - 'a';
            if (count[index] < 2) {
                count[index]++;

                windowSize = Math.max(windowSize, right - left + 1);
                right++;
            } else {
                int leftidx = s.charAt(left) - 'a';
                count[leftidx]--;
                left++;
            }

        }
        return windowSize;
    }
}