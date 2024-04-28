package array_and_hashing;

import java.util.*;

// Product of Array Except Self     https://leetcode.com/problems/product-of-array-except-self/description/
public class LeetCode238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf1(nums)));
    }

    // Using left and right array product
    public static int[] productExceptSelf1(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = 1;
        for(int i = 1; i < len; i++)
            left[i] = left[i - 1] * nums[i - 1];

        right[len - 1] = 1;
        for(int i = len - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];

        for(int i = 0; i < len; i++)
            nums[i] = left[i] * right[i];

        return nums;
    }

    // Using single result array
    public static int[] productExceptSelf2(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        // left product
        result[0] = 1;
        for(int i = 1; i < len; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for(int i = len - 1; i >= 0; i--) {
            result[i] = rightProduct * result[i];
            rightProduct = rightProduct * nums[i];
        }
        return result;
    }
}
