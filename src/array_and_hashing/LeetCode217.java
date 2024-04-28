package array_and_hashing;

import java.util.*;


// Contains Duplicate, https://leetcode.com/problems/contains-duplicate/description/
/*

    Different approaches to solve this problem

    1. Brute Force approach O(n^2)
    2. Sorting O(nlogn)
    3. HashSet O(n)
    4. HashMap O(n)

*/
public class LeetCode217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};

        boolean result = containsDuplicte4(nums);

        if(result)
            System.out.println("Contains duplicate");
        else
            System.out.println("Does not contain duplicate");
    }

    static boolean containsDuplicte1(int[] nums) {
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

    static boolean containsDuplicte2(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < len - 1; i++) {
            if(nums[i] == nums[i + 1])
                return true;
        }

        return false;
    }

    static boolean containsDuplicte3(int[] nums) {
        int len = nums.length;
        // List<Integer> seen = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(int num : nums) {
            if(seen.contains(num))
                return true;

            seen.add(num);
        }

        return false;
    }

    static boolean containsDuplicte4(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : nums) {
            if(freq.containsKey(num) && freq.get(num) >= 1)
                return true;

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return false;

        /*
            Using Functional Programming
            anyMatch(), takes a Predicate as an argument
            after creating a map of elements and their respective frequency
            return freq.values().stream().anyMatch(value -> value > 1);
        */
    }
}
