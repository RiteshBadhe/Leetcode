class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // If no valid pair is found, return an empty array instead of null
        return new int[] {};
    }
}
public class solve{
    public static void main(String args[]){
        int[] nums= {3,2,4};
        int target = 6;
        Solution s = new Solution();
        int[] result = s.twoSum(nums,target);
        System.out.println("Result is : "+result[0]+" and "+result[1]);
    }
}