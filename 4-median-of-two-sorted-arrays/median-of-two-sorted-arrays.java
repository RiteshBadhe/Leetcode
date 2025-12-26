
import java.util.Scanner;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);

        int m = merged.length;
        if (m % 2 == 0) {
            return (merged[m / 2 - 1] + merged[m / 2]) / 2.0;
        } else {
            return merged[m / 2];
        }
    }
}


public class Solve{
  public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {4, 5};

        
        Solution s = new Solution();
        double result = s.findMedianSortedArrays(num1, num2);

        System.out.println("Median = " + result);
    }

}

