class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] newNums1 = new int[1001];
        int[] newNums2 = new int[1001];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            newNums1[nums1[i]] = 1;
        }
         for (int i = 0; i < nums2.length; i++) {
            newNums2[nums2[i]] = 1;
        }
        for (int i = 0; i < newNums2.length; i++) {
            if(newNums1[i] == 1 && newNums2[i] == 1){
                list.add(i);
            }
        }
        int[] intArray = list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();

        return intArray;
    }
}