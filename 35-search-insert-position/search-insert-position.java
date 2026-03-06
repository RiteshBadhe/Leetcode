public class Solution {
    public int searchInsert(int[] nums, int target) {
         Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
           
            if(nums[i] > target){
                return i;
            }
        }

        return nums.length;
    }
    public static void main(String args[]){
        Solution s = new Solution();
          int nums[] = {1,3,5,6};
        s.searchInsert(nums,5);
    
    }
}