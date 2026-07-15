class Solution {
    public void rotate(int[] arr, int k) {
        if (arr.length == 0) return;
        k %= arr.length;

        rev(arr, 0, arr.length - 1);
        rev(arr, 0, k - 1);
        rev(arr, k, arr.length - 1);
    }

    static void rev(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}