package array.and.hashing;

import java.util.*;


// Contains Duplicate, https://leetcode.com/problems/contains-duplicate/description/
/*

    Different approaches to solve this problem

    1. Brute Force approach O(n^2)
    2. Sorting O(nlogn)
    3. HashSet O(n)
    4. HashMap 0(n)

*/
public class LeetCode217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        boolean result = Method4(nums);

        if(result)
            System.out.println("Contains duplicate");
        else
            System.out.println("Does not contain duplicate");
    }

    static boolean Method1(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean Method2(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }

    static boolean Method3(int[] nums) {
        int len = nums.length;
        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < len; i++) {
            if(seen.contains(nums[i]))
                return true;

            seen.add(nums[i]);
        }

        return false;
    }

    static boolean Method4(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            if(freq.containsKey(num) && freq.get(num) >= 1)
                return true;

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return false;
    }
}
