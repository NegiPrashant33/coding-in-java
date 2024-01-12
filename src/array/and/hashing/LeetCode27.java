package array.and.hashing;

// Remove Element https://leetcode.com/problems/remove-element/

public class LeetCode27 {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,2,3,0,4,2 };
        int val = 2;
        System.out.println(Method(nums, val));
    }

    static int Method(int[] nums, int val) {
        int k = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = -1;
                k--;
            }
        }

        int left = 0;
        int right = 0;
        while(right < nums.length) {
            if(nums[right] >= 0) {
                int temp = nums[left];
                nums[left++] = nums[right];
                nums[right] = temp;
            }
            right++;
        }

        /*

        int nonNegativeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                int temp = nums[nonNegativeIndex];
                nums[nonNegativeIndex++] = nums[i];
                nums[i] = temp;
            }
        }

        */


        return k;
    }
}
