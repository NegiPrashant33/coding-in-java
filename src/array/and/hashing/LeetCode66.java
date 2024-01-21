package array.and.hashing;
import java.util.*;

// Plus one https://leetcode.com/problems/plus-one/

public class LeetCode66 {
    public static void main(String[] args) {
        int[] digits = {4, 1, 9};

        System.out.println(Arrays.toString(Method(digits)));
    }

    static int[] Method(int[] digits) {
        int len = digits.length - 1;
        int[] result = new int[digits.length + 1];
        boolean carry = true;

        for (int i = len; i >= 0; i--) {
            if (carry) {
                if ((digits[i] + 1) > 9) {
                    digits[i] = (digits[i] + 1) % 10;
                } else {
                    digits[i] = digits[i] + 1;
                    carry = false;
                }
            }
        }

        if (carry) {
            result[0] = 1;
            for (int i = 0; i < len + 1; i++) {
                result[i + 1] = digits[i];
            }
            return result;
        }

        return digits;
    }
}
