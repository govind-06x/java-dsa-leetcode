class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            twoPointer(nums, i+1, nums.length-1, -(nums[i]), list);
        }
        return list;
    }
 public static void twoPointer(int[] nums , int start , int end , int target, List<List<Integer>> list){
        while (start < end) {
            if(nums[start] + nums[end] == target){
                list.add(new ArrayList<>());
                list.get(list.size() - 1).add(-target);
                list.get(list.size() - 1).add(nums[start]);
                list.get(list.size() - 1).add(nums[end]);
                start++;
                end--;
                while (start<end && nums[start] == nums[start-1]) {
                    start++;
                }
            }
            else if(nums[start] + nums[end] > target){
                end--;
            }else{
                start++;
            }
        }
    }
}