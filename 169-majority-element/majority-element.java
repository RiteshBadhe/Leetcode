/*class Solution {
    public int majorityElement(int[] nums) {

     int cnt=0; 
     for(int i=0; i<nums.length-1; i++){
     
     for(int j=0; j<nums.length; j++){
        if(nums[i] == nums[j]){
            cnt++;
        }

        if(cnt > nums.length/2){
            return nums[i];
        }
        }
     }
     return -1;
}
}*/class Solution {
    public int majorityElement(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int count = 0;

            for(int j=0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > nums.length/2){
                return nums[i];
            }
        }

        return -1;
    }
}