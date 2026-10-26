class Solution {
    public int minimumPairRemoval(int[] nums) {
        int cnt = 0;

        while (true) {
            boolean sorted = true;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                return cnt;
            }

            int minSum = Integer.MAX_VALUE;
            int index = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                int sum = nums[i] + nums[i + 1];

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            nums[index] = minSum;

            for (int i = index + 1; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }

            nums = java.util.Arrays.copyOf(nums, nums.length - 1);
            cnt++;
        }
    }
}