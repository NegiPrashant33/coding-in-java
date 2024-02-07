package array_and_hashing;
import java.util.*;
// Next Greater Element     https://leetcode.com/problems/next-greater-element-i/description/

/*
    Do it using stack
*/
public class LeetCode496 {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(Method(nums1, nums2)));
    }

    private static int[] Method(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int nextGreater = 0;
            boolean check = false;
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == target) {
                    check = true;
                }
                if(check && target < nums2[j]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            ans[i] = (nextGreater != 0) ? nextGreater : -1;
        }

        return ans;
    }
}
