package array.and.hashing;

// Concatenation of Array, https://leetcode.com/problems/concatenation-of-array/
public class LeetCode1929 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        for(int num : Method(nums))
            System.out.print(num + " ");
    }

    static int[] Method(int[] nums) {
        int[] ans = new int[nums.length * 2];

        int j = 0;
        for(int i = 0; i < ans.length; i++) {
            if(i >= nums.length)
                ans[i] = nums[j++];
            else
                ans[i] = nums[i];
        }

        return ans;
    }
}
