class Solution {
    public int[] decrypt(int[] code, int k) {
        int left = 1;
        int right = k;
        int nums[] = new int[code.length];
        if(k==0){
            return nums;
        }else if(k<0){
            k = -k;
            right = code.length-1;
            left = code.length -k;
        }
        int sum = 0;
        int index = left;
        for (int i = 0; i < k; i++) {
            sum += code[index++];
        }
        nums[0] = sum;
        for (int i = 1; i < code.length; i++) {
            sum = sum - code[(left++) % code.length] ;
            sum =  sum + code[(++right) % code.length];
            nums[i] = sum;
        }
        return nums;
    }
}