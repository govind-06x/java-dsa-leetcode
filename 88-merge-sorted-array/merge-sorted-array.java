class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int k = 0;
        int[] whole = new int[m + n];
        while (left < m && right < n) {
            if (nums1[left] < nums2[right]) {
                whole[k] = nums1[left];
                k++;
                left++;
            } else {
                whole[k] = nums2[right];
                k++;
                right++;
            }
        }
        while (left<m) {
            whole[k] = nums1[left];
            k++;left++;            
        }
          while (right<n) {
            whole[k] = nums2[right];
            k++;right++;            
        }
        for (int l = 0; l < whole.length; l++) {
            nums1[l] = whole[l];
        }
    }
}