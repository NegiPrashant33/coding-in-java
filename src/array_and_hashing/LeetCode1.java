package array_and_hashing;
import java.util.*;

// Two Sum https://leetcode.com/problems/two-sum/description/
/*

    Different approaches to solve this problem

    1. Brute Force approach O(n^2)
    2. HashMap O(n)

*/
public class LeetCode1 {
    public static void main(String[] args) {
        int[]  nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }


    static int[] twoSum1(int[] nums, int target) {
         for(int i = 0; i < nums.length; i++) {
             int diff = target - nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(diff == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }


    static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                 return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
