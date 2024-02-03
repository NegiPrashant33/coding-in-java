package array_and_hashing;
import java.util.*;

// Majority Element https://leetcode.com/problems/majority-element/description/

public class LeetCode169 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(Method(nums));
    }

    static int Method(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(int key : count.keySet()) {
            if(count.get(key) > (nums.length / 2)) {
                return key;
            }
        }

        return 0;
    }
}
