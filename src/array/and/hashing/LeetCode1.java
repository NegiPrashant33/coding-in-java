package array.and.hashing;
import java.util.*;

// Two Sum https://leetcode.com/problems/two-sum/description/
public class LeetCode1 {
    public static void main(String[] args) {
        int[]  nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(Method(nums, target)));
    }

    static int[] Method(int[] nums, int target) {
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
