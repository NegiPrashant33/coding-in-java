package array_and_hashing;

// Find pivot element       https://leetcode.com/problems/find-pivot-index/description/
public class LeetCode724 {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(Method(nums));
    }

    private static int Method(int[] nums) {
        int sum = 0;
        int len = nums.length;
        for(int num : nums)
            sum += num;

        int currentSum = 0;
        for(int i = 0; i < len; i++) {
            int leftSum = currentSum;
            int rightSum = sum - currentSum - nums[i];

            if(leftSum == rightSum)
                return i;

            currentSum += nums[i];
        }
        return -1;
    }
}
