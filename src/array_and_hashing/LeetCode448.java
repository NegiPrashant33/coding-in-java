package array_and_hashing;
import java.util.*;
// Find all numbers dissapeared in an array     https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

/*
    Do it without extra space that the set takes
*/

public class LeetCode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(Method(nums));
    }

    private static List<Integer> Method(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int num : nums)
            set.add(num);

        List<Integer> missing = new ArrayList<>();
        for(int i = 1; i <= len; i++) {
            if(!set.contains(i))
                missing.add(i);
        }
        return missing;
    }
}
