package array_and_hashing;
import java.util.*;

// Longest Consecutive Sequence     https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LeetCode128 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive2(nums));
    }

    // Sorting
    public static int longestConsecutive1(int[] nums) {
        int len = nums.length;

        if(len == 0)
            return 0;

        Arrays.sort(nums);

        int count = 1;
        int max = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1)
                    count++;

                else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
        }

        return Math.max(max, count);
    }

    // HashMap
    public static int longestConsecutive2(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> map = new HashMap<>();
        for(int num : nums)
            map.put(num, Boolean.FALSE);

        for(int num : nums) {
            int currentLength = 1;

            map.put(num, Boolean.TRUE);

            // checking in forward direction
            int nextNum = num + 1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false) {
                currentLength++;
                map.put(nextNum, Boolean.TRUE);

                nextNum++;
            }

            // checking in backword direction
            int prevNum = num - 1;
            while(map.containsKey(prevNum) && map.get(prevNum) == false) {
                currentLength++;
                map.put(prevNum, Boolean.TRUE);

                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);
        }
        System.out.println(map);
        return longestLength;
    }
}
