class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           int[] whole = new int[nums1.length + nums2.length];

    int left = 0;
    int right = 0;
    int k = 0;

    while (left < nums1.length && right < nums2.length) {
        if (nums1[left] < nums2[right]) {
            whole[k++] = nums1[left++];
        } else {
            whole[k++] = nums2[right++];
        }
    }

    while (left < nums1.length) {
        whole[k++] = nums1[left++];
    }

    while (right < nums2.length) {
        whole[k++] = nums2[right++];
    }

    int mid = whole.length / 2;

    if (whole.length % 2 == 0) {
        return (whole[mid] + whole[mid - 1]) / 2.0;
    }

    return whole[mid];
    }
}