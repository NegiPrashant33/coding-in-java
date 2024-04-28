package two_pointers;
import java.util.*;

// Two Sum II - Input sorted array      https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class LeetCode167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start < end) {
            int sum = numbers[start] + numbers[end];
            if(sum > target)
                end--;
            else if(sum < target)
                start++;
            else
                return new int[]{start + 1, end + 1};
        }
        return new int[]{};
    }
}
