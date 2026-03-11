import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);   // needed for index comparison

        for(int i = 0; i < nums.length; i++){
            if(i != nums[i]){
                return i;
            }
        }

        // if nothing missing inside array
        return nums.length;
    }
}