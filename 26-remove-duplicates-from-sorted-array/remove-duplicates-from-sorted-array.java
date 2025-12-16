import java.util.Arrays;
import java.util.Scanner;

class Solution {


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int newLength = removeDuplicates(nums);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.println(nums[i]);
        }

        sc.close();
    }
}
